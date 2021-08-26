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
If the validation is successful, it will set the jLabel10.text to empty string. 
The jLabel10 will eventually store the average result as a string and will be displayed to the user. 
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
We will the set jLabel7, jLabel8, and jLabel9 to empty strings. 
jLabel7, jLabel8, and jLabel9 are used for displaying the total numbers, the sum, and the average respectively.
*/
		
 jLabel10.setText("Pls. Check your input");
 jLabel7.setText("");
 jLabel8.setText("");
 jLabel9.setText("");
            
 }
        
}
```
