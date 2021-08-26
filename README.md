# Average of Numbers Calculator with Regex Validation
This calculator was built using Java Swing. Use this calculator to find the average or mean of a data set. Enter values separated by commas or spaces.



# User Interface
The user interface contains a single JTextArea in which the user can enter the input. It also contains a calculate button that the user will need to click to start the validation of input and after which the calculation. After the calculation, it will display the total numbers, the sum of the numbers and finally the average. It will round the average to three decimal places.

![Average Calculator Java UI](https://user-images.githubusercontent.com/86467782/130778857-f845f2df-b323-4910-8f50-3db364a4f439.png)



# calculateButton onClick() Handler
After clicking the calculate button, the calculateButtonClicked() method will execute because it is assigned as the onClick() Handler for the calculate button.

```java
private void calculateButtonClicked(java.awt.event.MouseEvent evt) {
        
		
		
		
// First, it will store the contents of the JTextArea into String called 'contents'.
String contents = jTextArea1.getText();
        
		
		
	
/*
If the validation returns true:
We will also need to extract the numbers from the string input so that we can perform calculation on them. 
We extract the numbers from the string input using the extractInt() method which we will explain later. 
The extractInt() can extract integers(positive and negative) and decimals. 
After extracting the numbers, it will then store them in a String array.
We use the built-in split() method of String in order to split the original input further and store each individual 
string numbers to the String array. We use the whitespace value for splitting the input string into array. 
After getting the String array, we will then convert the string numbers into double and store them in an arrayList. 
After we have our arrayList, we are finally ready to calculate the average/mean. 
We use the calculateAverage() method for calculating the average and storing the result in the 'average' 
variable of type double. We use BigDecimal for formatting the result. 
We use BigDecimal to set how many decimal places to round our result to and to also set the RoundingMode. 
jLabel7 will display the total numbers. It determines the total numbers of the input using the built-in size() 
method of the ArrayList. jLabel9 will display the average/mean. 
It will display the average/mean using the built-in toPlainString() method of the BigDecimal.
*/
		
if(validateJTextArea(contents)){
        
            
            
  String str = extractInt(contents);
            
            
  String s[] = str.split(" ");
  ArrayList<Double> a = new ArrayList<>(s.length);
            
  for(int i =0 ;i < s.length;i++){
            
     a.add(Double.parseDouble(s[i]));
                
  }
            
            
  double average = calculateAverage(a);
  BigDecimal bd = new BigDecimal(Double.toString(average));
  bd = bd.setScale(3, RoundingMode.HALF_UP);
            
  jLabel7.setText(Integer.toString(a.size()));
  jLabel9.setText(bd.toPlainString());
                    


            
}
else{
        
/*
If the validation returns false:
If the validation is unsuccessful, we will inform the user to check his input. We show that warning using jLabel10. 
We will then set jLabel7, jLabel8, and jLabel9 to empty strings. 
jLabel7, jLabel8, and jLabel9 are used for displaying the total numbers, the sum, and the average respectively.
*/
		
 jLabel10.setText("Pls. Check your input");
 jLabel7.setText("");
 jLabel8.setText("");
 jLabel9.setText("");
            
 }
        
}
```



# Input Validation

```java
private boolean validateJTextArea(String content){
    
        
   // The validateJTextArea() method is used for validating user input. 
   // It uses REGEX to validate the input.
   // Some examples of inputs that are accepted by the REGEX are listed below.
   // This method will return true if the input is accepted and false if it isn't.
		
		
   /*
     Test values:
      , ,1, ,, ,  2 3, 4, 5,6, ,
      , ,1, ,, ,  2 3,a 4, 5,6, ,
      , ,00000.00000, ,, ,  .12345 -.12345, 0.12345, 00000.12345,-12345.12345, ,-12,345.12345 , ,123123123.12345, ,, ,  12345.12345  1000, 1000, ,-50,-50.12345
   */


    /*
			
    REGEX EXPLANATION:
			
    (\\,*\\s*\\n*)*
    - The '*' indicates that the pattern can occur 0 or more times.
    - \\,* means 0 or more commas.
    - \\s* means 0 or more whitespaces.
    - \\n* means 0 or more newlines.
    - They can occur in any order.
    - (\\,*\\s*\\n*)* Combined together, they create a single REGEX pattern that can occur 0 or more times.
    - (\\,*\\s*\\n*)* can occur before a number or after a number.
			
			
			
     \\-?\\d*(\\.\\d+)?
     - The '?' indicates that the pattern can occur once or not at all. 
     - The '+' indicates 1 or more times.
     - \\-? means that a negative sign can occur once or not at all.
     - \\d* means that a digit can occur 0 or more times.
     - \\-?\\d* REGEX for a number with negative sign or just a number without the negative sign.
			
     - \\-?\\d* This REGEX pattern means that you can even omit both the negative sign and the number 
	leaving you only with the dot followed by the decimal digits (e.g. .12345)
			   
     - (\\.\\d+)? REGEX for a dot followed by a single or more digit (e.g. .12345). This whole pattern can occur once or not at all.
     - \\-?\\d*(\\.\\d+)? Altogether, this REGEX can accept negative numbers and decimal numbers.
     - \\-?\\d*(\\.\\d+)? This REGEX can accept even just a dot followed by decimal numbers without the whole number part.
     - \\-?\\d*(\\.\\d+)? Finally, this pattern can also accept this input '-.12345'. A negative sign followed by a dot and the 
	decimal digits.
			
			
			
     ((\\,+|\\s+|\\n+)\\-?\\d*(\\.\\d+)?)+
     - The '|' is the symbol for the conditional OR.
     
     - (\\,+|\\s+|\\n+) means a comma that occurs 1 or more time or
       a whitespace that occurs 1 or more time or a newline that occurs 
       1 or more time. We use '+' here because it is required that the numbers 
       be separated by commas and whitespaces or even newlines. They can occur in 
       any order.
			  
     - \\-?\\d*(\\.\\d+)? This bit right here has already been explained above.
			
     - ((\\,+|\\s+|\\n+)\\-?\\d*(\\.\\d+)?)+ Altogether, This whole pattern 
       will accept commas, whitespaces and newlines that can occur in any order followed by 
       numbers(negative or positive) or numbers with decimals or numbers with only a dot followed by 
       decimal digits without the whole number part.
			  
			  
			  
			  
      (\\,*\\s*\\n*)*
      - This bit right here was already explained above.
      - It can occur at the start or end of a number or numbers.
			  
     */
        
     return Pattern.matches("(\\,*\\s*\\n*)*\\-?\\d*(\\.\\d+)?((\\,+|\\s+|\\n+)\\-?\\d*(\\.\\d+)?)+(\\,*\\s*\\n*)*", content);
        
    }
```



# Examples

![Untitled](https://user-images.githubusercontent.com/86467782/130931408-c37c39a5-2abc-4f53-b2fa-6a07984868d0.png)

![Untitled2](https://user-images.githubusercontent.com/86467782/130931526-fc6ee5d2-3154-411b-b93d-3852e2ad6b7d.png)

![Untitled3](https://user-images.githubusercontent.com/86467782/130931684-836e7499-11ef-440d-b8ae-8cec6766a0e5.png)

![Untitled4](https://user-images.githubusercontent.com/86467782/130931797-b5b6198d-019d-40ba-ac19-bcb4779245b7.png)

![Untitled5](https://user-images.githubusercontent.com/86467782/130931930-1f0b6345-4ba0-4455-af29-c6807b8aadc4.png)

