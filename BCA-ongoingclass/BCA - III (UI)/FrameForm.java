import java.awt.*;  
public class FrameForm extends Frame {  
  
FrameForm(){  
Label firstName = new Label("First Name");  
firstName.setBounds(20, 50, 80, 20);  
  
Label lastName = new Label("Last Name");  
lastName.setBounds(20, 80, 80, 20);  
  
Label dob = new Label("Date of Birth");  
dob.setBounds(20, 110, 80, 20);  
  
TextField firstNameTF = new TextField();  
firstNameTF.setBounds(120, 50, 100, 20);  
  
TextField lastNameTF = new TextField();  
lastNameTF.setBounds(120, 80, 100, 20);  
  
TextField dobTF = new TextField();  
dobTF.setBounds(120, 110, 100, 20);  
  
Button sbmt = new Button("Submit");  
sbmt.setBounds(10, 15, 100, 30);  
  
Button reset = new Button("Reset");  
reset.setBounds(10,15,100,30);  


add(reset); 
add(firstName);  
add(lastName);  
add(dob);  
add(firstNameTF);  
add(lastNameTF);  
add(dobTF);  
add(sbmt);  

setSize(500,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
FrameForm awt = new FrameForm();    
}  
}
