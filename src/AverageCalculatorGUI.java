
package com.lhm777.averagecalculator;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.regex.*;  
import javax.swing.JFormattedTextField;

public class AverageCalculatorGUI extends javax.swing.JFrame {

    /**
     * Creates new form AverageCalculatorGUI
     */
    public AverageCalculatorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Average Calculator Results");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Enter all items in the field below, separated by comma, space or line break:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateButtonClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Average Calculator");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total Numbers:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Sum of Numbers:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Average:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonClicked
        
		
		
		
		// First, it will store the contents of the JTextArea into String called 'contents'.
        String contents = jTextArea1.getText();
        
		
		
	
		/*
		If the validation returns true:
		If the validation is successful, it will set the jLabel10.text to empty string. The jLabel10 will eventually store the average result as a string and will be displayed to the user. We will also need to extract the numbers from the string input so that we can perform calculation on them. We extract the numbers from the string input using the extractInt() method which we will explain later. The extractInt() can extract integers(positive and negative) and decimals. After extracting the numbers, it will then store them in a String array. We use the built-in split() method of String in order to split the original input further and store each individual string numbers to the String array. We use the whitespace value for splitting the input string into array. After getting the String array, we will then convert the string numbers into double and store them in an arrayList. After we have our arrayList, we are finally ready to calculate the average/mean. We use the calculateAverage() method for calculating the average and storing the result in the 'average' variable of type double. We use BigDecimal for formatting the result. We use BigDecimal to set how many decimal places to round our result to and to also set the RoundingMode. jLabel7 will display the total numbers. It determines the total numbers of the input using the built-in size() method of the ArrayList. jLabel9 will display the average/mean. It will display the average/mean using the built-in toPlainString() method of the BigDecimal.
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
			If the validation is unsuccessful, we will inform the user to check his input. We show that warning using jLabel10. We will the set jLabel7, jLabel8, and jLabel9 to empty strings. jLabel7, jLabel8, and jLabel9 are used for displaying the total numbers, the sum, and the average respectively.
		    */
		
            jLabel10.setText("Pls. Check your input");
            jLabel7.setText("");
            jLabel8.setText("");
            jLabel9.setText("");
            
        }
        
    }//GEN-LAST:event_calculateButtonClicked


    
    
    private double calculateAverage(ArrayList<Double> arrayList){
    
		// We use the calculateAverage() method to calculate the average and return the result as a double.
		// It takes an ArrayList of Double as a parameter.
		// It has a variable called 'total' of type double. This variable will store the sum of all the numbers.
		// It uses a for-each loop to loop through the entire arraylist and to add the numbers to together and store them in the total variable.
		// It uses jLabel8 to display the total to the user.
		// And finally, to get the average, it divides the total by the arrayList size.
		
		
        double total = 0;
        
        for(double x:arrayList){
        
            total = total + x;
        }
        
        jLabel8.setText(String.valueOf(total));
        return total / arrayList.size();
    }
    
    
    
    
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
    
    
    
    private String extractInt(String str){
    
	
		// This method is used to extract the numbers from the string input.
		// It can extract integers(positive and negative)(with or without decimals).
		// It can also extract numbers without whole numbers, only decimals (e.g. .12345)
		// It can also extract this input '-.12345'. A negative sign followed by a dot and the decimal digits.
		// After extracting the numbers, it will then use the built-in trim() method 
		// of String to delete any leading and trailing whitespaces and returns 
		// the result as a String.
		
		
		
		// First, it replaces all newlines with a single whitespace
		// It uses the buil-in replaceAll() method of String.
        str = str.replaceAll("\\n+", " ");
		
		// Second, it replaces all commas with a single whitespace
		// It uses the buil-in replaceAll() method of String.
        str = str.replaceAll("\\,+", " ");
		
		// Third, it replaces all consecutive whitespace with a single whitespace
		// It uses the buil-in replaceAll() method of String.
        str = str.replaceAll("\\s+", " ");
		
		// Finally, it uses the built-int trim() method of String to remove all leading and trailing whitespaces.
        str = str.trim();

		// It returns the final string. 
		// The final string will be string numbers separated by a single whitespace.
        return str;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
