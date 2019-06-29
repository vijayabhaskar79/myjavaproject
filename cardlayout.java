import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;

public class cardlayout extends JApplet
{   
    
    	// declaring the base panel
	 JPanel mainpanel;

	// declaring the secondary panelsa
     JPanel regpanel,loginpanel,shoppingpanel,errorpanel,thankingpanel,okpanel;

	// declaring cardlayout
     CardLayout c1;

	// declaring buttons for loginpanel
     JButton button1,loginbutton;

	// declaring buttons for regpanel
     JButton acceptButton,cancelButton,resetButton;

     JLabel label1,label3,piclabel;

	// declaring textfields for regpanel
     JTextField   textfirstname,textlastname,textaddress,textpincode,textphone,textpassword,textrepassword,textshopperid,textemailid,textcreditcardno,textcreditcardtype,textexpirydate;

	// declaring combobox for regpanel
      JComboBox combocity,combostate,combocountry;

	// declaring password fields for regpanel
      JPasswordField password,textPassword;
	
      JPasswordField repassword;

	// declaring labels for loginpanel
      JLabel newLabel,labShopperId, labPassword;

	// declaring textfield fodr login panel
     JTextField textShopperId;

	// declarling icon for login panel
     Icon imageicon = new ImageIcon("hand.gif");
     Icon imhome = new ImageIcon("Home.jpg");
     Icon imshop = new ImageIcon("shop.jpg");
     Icon imlog = new ImageIcon("log.jpg");
	// declaring labels for thanking panel
	JLabel congrats,yourshopid,shopperidis;



	// declaring buttons for thanking panel
	JButton shopbutton,homebutton,shop1button,home1button;
	// declaring strings
		String shoppersid;

	//declaring labels,comboboxes for shopping panel

	JLabel labeltoyname,labeltoyquantity,labeltotalcost,labelcost,labelcreditcardno,labelgiftwrap,labelmessage;
	JTextField texttoyquantity,textmessage,textcreditno;
	JComboBox listgiftwrap,listtoyname;
	GridBagConstraints gb;
	GridBagLayout gf;
	JButton order,cancel,reset;
	Icon reseticon = new ImageIcon("reset.jpg");
	Icon ordericon = new ImageIcon("order.jpg");
	

    public void init()
    {
     c1 = new CardLayout();
    mainpanel = (JPanel)getContentPane();
    loginpanel = new JPanel();
    regpanel = new JPanel();
    shoppingpanel  = new JPanel();
    errorpanel = new JPanel();
    thankingpanel = new JPanel();
    okpanel = new JPanel();

    loginpanel.setBackground(Color.cyan);
    regpanel.setBackground(Color.pink);
    shoppingpanel.setBackground(Color.yellow);
    thankingpanel.setBackground(Color.pink);    
	okpanel.setBackground(Color.orange);
    mainpanel.setLayout(c1);
        
    label1 = new JLabel("If you are New User ");

     
     button1 = new JButton("Click Here");
        
    label3 = new JLabel("WELCOME TO TOY UNIVERSE SHOPPING");
	label3.setForeground(Color.red);
   
    mainpanel.add("loginpanel",loginpanel);
    
    mainpanel.add("regpanel",regpanel);
    
    mainpanel.add("shoppingpanel",shoppingpanel);
   
    shoppingpanel.add(label3);
     
    
    mainpanel.add("errorpanel",errorpanel);
    mainpanel.add("thankingpanel",thankingpanel);

    mainpanel.add("okpanel",okpanel);

    addregcontrols();
    addlogincontrols();
    regthanking();
    shopping();
	orderok();
     }
	public void addregcontrols()
	{
	 JLabel labfirstname,lablastname,labaddress,labcity,labstate,labpincode,labphone,labcountry,labpassword,labrepassword,labshopperid,labemailid,labcreditcardno,labcreditcardtype,labexpirydate;
	
  	 GridBagConstraints gbc;
         GridBagLayout gg;
   
    // adding layouts and constraints to panel
   	 gg = new GridBagLayout();
   	 gbc = new GridBagConstraints();
    	 regpanel.setLayout(gg);
    
    // declaring label and naming them
    	 labfirstname = new JLabel("First Name");
  	 lablastname = new JLabel("Last Name");
   	 labpassword = new JLabel("Password");
  	 labrepassword = new JLabel("Re type Password");
  	 labaddress = new JLabel("Address");
  	 labcity = new JLabel("City");
  	 labstate = new JLabel("State");
  	 labcountry = new JLabel("Country");
  	 labpincode = new JLabel("Pincode");
  	 labphone = new JLabel("Phone no");
  	 labshopperid = new JLabel("Shopper ID");
  	 labemailid = new JLabel("E-mail ID");
   	 labcreditcardno = new JLabel("CreditCard No");
         labcreditcardtype = new JLabel("CreditCard Type");
   	 labexpirydate = new JLabel("ExpiryDate");

    // declaring texts and naming them
   	 textfirstname = new JTextField(15);
  	 textlastname = new JTextField(15);
   	 textaddress = new JTextField(25);
   	 textpincode = new JTextField(6);
   	 textphone = new JTextField(7);
   	 password = new JPasswordField(15);
         repassword = new JPasswordField(15);
 	 String state[] = {"California      ","Georgia        ","Illinois       ","Maryland       ","Nevada         ","Utah           ","Virginia  ",
			 "Karnataka","Andhra pradesh","Arunachal pradesh","kerela","Tamil nadu","Maharastra","Gujrat","Rajasthan","Bihar","Punjab","Manipur","Westbengal","Others" };
  	 String city[] = { "Sunnyvale       ","San Jose       ","Hill Avenue    ","Brooklyn       ","Sunnyvale      ","Las Vegas      ","WayMarietta    ","Naperville     ","San Ramon      ","Virginia Beach",
		 "Bangalore","Delhi","Bombay","Calcutta","Chennai","Hyderabad","Trivandrum","Jaipur","Chandigar" } ;
   	 String country[] = { "United states of America ","Albania ","Andorra","Argentina"," Austria","Bangladesh","Belgium","Bosnia & Herzegovina ","Bulgaria ",
		"Czech Republic           ","Denmark                  ","Yugoslavia               ","France                   ","Gibraltar                ","Greece                   ","Georgia                  ",
		"Croatia                  ","Estonia                  ","Iceland                  ","Italy                    ","Israel                   ","India                    ","Cyprus                   ",
		"Russia                   ","Liechtenstein            ","Lithuania                ","Luxembourg               ","Malta                    ","Moldova                  ","Monaco                   ",
		"Netherlands              ","Norway                   ","Poland                   ","Portugal                 ","Romania                  ","San Marino               ","Slovak Republic          ",
		"Slovenia                 ","Finland                  ","Spain                    ","Switzerland              ","Turkey                   ","Ukraine                  ","Hungary                  ",
		"Germany                  ","Sweden                   ","Latvia                   ","Others" } ;
   	 combostate = new JComboBox(state);
    	 combocity = new JComboBox(city);
   	 combocountry = new JComboBox(country);
   	 textshopperid = new JTextField(12);
   	 textemailid = new JTextField(15);
   	 textcreditcardno = new JTextField(10);
   	 textcreditcardtype = new JTextField(10);
   	 textexpirydate = new JTextField(10);
 
    // creating buttons
 	 acceptButton = new JButton("  ACCEPT  ");
  	 cancelButton = new JButton("  CANCEL  ");
  	 resetButton = new JButton("  RESET  ");
   	 Border bevelBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);
   	 acceptButton.setBorder(bevelBorder);
   	 cancelButton.setBorder(bevelBorder);
   	 resetButton.setBorder(bevelBorder);
    
    // setting tooltips to buttons
   	 resetButton.setToolTipText("Clears the registration form");
  	 acceptButton.setToolTipText("Accepts your registration");
  	 cancelButton.setToolTipText("Returns to the mainpage");
    
    // declaring colours to panel ,comboboxes and buttons
   	 combostate.setBackground(Color.white);
  	 combocity.setBackground(Color.white);
  	 combocountry.setBackground(Color.white);
    	 acceptButton.setBackground(Color.orange);
  	 cancelButton.setBackground(Color.white);
   	 resetButton.setBackground(Color.green);   
         acceptButton.setMnemonic('A');
         cancelButton.setMnemonic('C');
         resetButton.setMnemonic('R');
    
    
    // Adding controls to panel
	gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 5;
    gg.setConstraints(labshopperid,gbc);
    regpanel.add(labshopperid);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 5;
    gg.setConstraints(textshopperid,gbc);
    regpanel.add(textshopperid);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 8;
    gg.setConstraints(labfirstname,gbc);
    regpanel.add(labfirstname);
    
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 8;
    gg.setConstraints(textfirstname,gbc);
    regpanel.add(textfirstname);
	
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 11;
    gg.setConstraints(lablastname,gbc);
    regpanel.add(lablastname); 
    
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 11;
    gg.setConstraints(textlastname,gbc);
    regpanel.add(textlastname);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 14;
    gg.setConstraints(labpassword,gbc);
    regpanel.add(labpassword);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 14;
    gg.setConstraints(password,gbc);
    regpanel.add(password);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 17;
    gg.setConstraints(labrepassword,gbc);
    regpanel.add(labrepassword);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 17;
    gg.setConstraints(repassword,gbc);
    regpanel.add(repassword);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 20;
    gg.setConstraints(labaddress,gbc);
    regpanel.add(labaddress);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 20;
    gg.setConstraints(textaddress,gbc);
    regpanel.add(textaddress);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 23;
    gg.setConstraints(labcity,gbc);
    regpanel.add(labcity);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 23;
    gg.setConstraints(combocity,gbc);
    regpanel.add(combocity);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 26;
    gg.setConstraints(labpincode,gbc);
    regpanel.add(labpincode);


    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 26;
    gg.setConstraints(textpincode,gbc);
    regpanel.add(textpincode);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 29;
    gg.setConstraints(labphone,gbc);
    regpanel.add(labphone);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 29;
    gg.setConstraints(textphone,gbc);
    regpanel.add(textphone);
   
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 32;
    gg.setConstraints(labstate,gbc);
    regpanel.add(labstate);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 32;
    gg.setConstraints(combostate,gbc);
    regpanel.add(combostate);
   
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 35;
    gg.setConstraints(labcountry,gbc);
    regpanel.add(labcountry);
   
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 35;
    gg.setConstraints(combocountry,gbc);
    regpanel.add(combocountry);
    
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 38;
    gg.setConstraints(labemailid,gbc);
    regpanel.add(labemailid);
    
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 38;
    gg.setConstraints(textemailid,gbc);
    regpanel.add(textemailid);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 41;
    gg.setConstraints(labcreditcardno,gbc);
    regpanel.add(labcreditcardno);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 41;
    gg.setConstraints(textcreditcardno,gbc);
    regpanel.add(textcreditcardno);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 44;
    gg.setConstraints(labcreditcardtype,gbc);
    regpanel.add(labcreditcardtype);
    
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 44;
    gg.setConstraints(textcreditcardtype,gbc);
    regpanel.add(textcreditcardtype);
  
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 1;
    gbc.gridy = 47;
    gg.setConstraints(labexpirydate,gbc);
    regpanel.add(labexpirydate);
    
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 6;
    gbc.gridy = 47;
    gg.setConstraints(textexpirydate,gbc);
    regpanel.add(textexpirydate);

    // adding buttons to panel
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 7;
    gbc.gridy = 51;
    gg.setConstraints(acceptButton,gbc);
    regpanel.add(acceptButton);
    
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 8;
    gbc.gridy = 51;
    gg.setConstraints(cancelButton,gbc);
    regpanel.add(cancelButton);

    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.gridx = 9;
    gbc.gridy = 51;
    gg.setConstraints(resetButton,gbc);
    regpanel.add(resetButton);

    actionperformed act = new actionperformed();

    acceptButton.addActionListener(act);
  
    cancelButton.addActionListener(act);
    
    resetButton.addActionListener(act);
	
    }
    
    public void addlogincontrols()
    {
         
     GridBagLayout g1 = new GridBagLayout();
     GridBagConstraints gbcts = new GridBagConstraints();
     loginpanel.setLayout(g1);
     
     loginbutton = new JButton(imlog);
     button1.setBackground(Color.cyan);

     Border bevelBorder1 = BorderFactory.createBevelBorder(BevelBorder.RAISED);
     loginbutton.setBorder(bevelBorder1);
     newLabel = new JLabel("Registered User Please enter your");
     labShopperId = new JLabel("ShopperID :");
     labPassword = new JLabel("Password :");
     piclabel = new JLabel("");
     piclabel.setIcon(imageicon);

     textShopperId  = new JTextField(10);
     textPassword = new JPasswordField(10);
     
     gbcts.anchor = GridBagConstraints.NORTHWEST;
     gbcts.gridx = 1;
     gbcts.gridy = 1;
     g1.setConstraints(label1,gbcts);
     loginpanel.add(label1);
     
     gbcts.anchor = GridBagConstraints.NORTHWEST;
     gbcts.gridx = 5;
     gbcts.gridy = 1;
     g1.setConstraints(button1,gbcts);
     loginpanel.add(button1);
   
     gbcts.anchor = GridBagConstraints.NORTHWEST;
     gbcts.gridx = 8;
     gbcts.gridy = 1;
     g1.setConstraints(piclabel,gbcts);
     loginpanel.add(piclabel);

     gbcts.anchor = GridBagConstraints.NORTHWEST;
     gbcts.gridx = 1;
     gbcts.gridy = 3;
     g1.setConstraints(newLabel,gbcts);
     loginpanel.add(newLabel);

     gbcts.anchor = GridBagConstraints.NORTHWEST;
     gbcts.gridx = 1;
     gbcts.gridy = 6;
     g1.setConstraints(labShopperId,gbcts);
     loginpanel.add(labShopperId);
     
          
     gbcts.anchor = GridBagConstraints.SOUTHWEST;
     gbcts.gridx = 5;
     gbcts.gridy = 6;
     g1.setConstraints(textShopperId,gbcts);
     loginpanel.add(textShopperId);
   
     gbcts.anchor = GridBagConstraints.NORTHWEST;
     gbcts.gridx = 1;
     gbcts.gridy = 9;
     g1.setConstraints(labPassword,gbcts);
     loginpanel.add(labPassword);
    
     gbcts.anchor = GridBagConstraints.SOUTHWEST;
     gbcts.gridx = 5;
     gbcts.gridy = 9;
     g1.setConstraints(textPassword,gbcts);
     loginpanel.add(textPassword);
    
     gbcts.anchor = GridBagConstraints.NORTHWEST;
     gbcts.gridx = 1;
     gbcts.gridy = 12;
     g1.setConstraints(loginbutton,gbcts);
     loginpanel.add(loginbutton);
 
    actionperformed act = new actionperformed();
     button1.addActionListener(act);
     loginbutton.addActionListener(act);  
    }  
	public void regthanking()
	{
		GridBagConstraints gbct;
   	        GridBagLayout gg1;
   
   		 // adding layouts and constraints to panel
	   	 gg1 = new GridBagLayout();
   		 gbct = new GridBagConstraints();
	    	 thankingpanel.setLayout(gg1);
    
		congrats = new JLabel("Congrats  !!! you have been sucessfully registered for shopping.");
		yourshopid = new JLabel("Do you wish to continue shopping? If Yes click shopping else click home...");
		//shopperidis = new JLabel("This shopping site is underconstruction and will be updated soon. Please Cooperate");
		
		
		home1button = new JButton(imhome);
		shop1button = new JButton(imshop);
		home1button.setBackground(Color.pink);
		shop1button.setBackground(Color.pink);
		/*actionperformed act = new actionperformed();
		home1button.addActionListener(act);
		shop1button.addActionListener(act);*/
		
		gbct.anchor = GridBagConstraints.NORTH;
     		gbct.gridx = 1;
    		gbct.gridy = 5;
 		gg1.setConstraints(congrats,gbct);
    		thankingpanel.add(congrats);
		
		gbct.anchor = GridBagConstraints.NORTHWEST;
     		gbct.gridx = 1;
    		gbct.gridy = 8;
 		gg1.setConstraints(yourshopid,gbct);
    		thankingpanel.add(yourshopid);
		
		gbct.anchor = GridBagConstraints.NORTHWEST;
     		gbct.gridx = 1;
    		gbct.gridy = 8;
 		gg1.setConstraints(yourshopid,gbct);
    		thankingpanel.add(yourshopid);
		
		gbct.anchor = GridBagConstraints.NORTHWEST;
     		gbct.gridx = 1;
    		gbct.gridy = 12;
 		gg1.setConstraints(home1button,gbct);
    		thankingpanel.add(home1button);
		
		gbct.anchor = GridBagConstraints.NORTHWEST;
     		gbct.gridx = 5;
    		gbct.gridy = 12;
 		gg1.setConstraints(shop1button,gbct);
    		thankingpanel.add(shop1button);
		actionperformed act = new actionperformed();
		home1button.addActionListener(act);
		shop1button.addActionListener(act);
		
	}	
	public void shopping()
	{
		gb = new GridBagConstraints();
		gf = new GridBagLayout();
		
		shoppingpanel.setLayout(gf);
		labeltoyname = new JLabel("Toy Name ");
		labeltoyquantity = new JLabel("Toy Quantity");
		labeltotalcost = new JLabel("Total Cost");
		labelcost = new JLabel(" ");
		labelgiftwrap = new JLabel("Gift Wrap");
		labelmessage = new JLabel("Message");
		labelcreditcardno = new JLabel("CreditCard NO");
    
    		texttoyquantity = new JTextField(2);
	        textmessage = new JTextField(15);
		textcreditno = new JTextField(10);
    
    		/*String paymentmode[]= {"Cash","Credit Card","Cheque","DD"};
		    listmodeofpayment = new JComboBox(paymentmode);
		    listmodeofpayment.setBackground(Color.cyan);*/
    
    		String giftwrap[] = {"Yes","No"};
		    listgiftwrap = new JComboBox(giftwrap);
		    listgiftwrap.setBackground(Color.white);

    String toyname[] = {"Alice in Wonderland","Baby Minnie","Beautifull Hair Doll","Birthday Party","Children's Bedroom","Dune Racer","Electronic Safe","Flower Loving Doll","Glamorous Doll","Glass Decoration","Key Boom Guitar","Kitchen Set","Large Duck",
                        "Light Show Lamp","My First Flashlight","Nursery","Parachute and Rocket","Pet Loving Doll","Racing Truck","Robby the Whale ","Sleeping Beauty Doll","Spiral Zoom  Way","Super Deluge","Tie Dye Kit","Tin Drum","Victorian Dollhouse","Victorian Family ",
                        "Water Channel System","X-90 Racers Set"};

    listtoyname = new JComboBox(toyname);           
    listtoyname.setBackground(Color.white);

     String toyrate[] ={"18.4900"," 18.4900"," 18.4900"," 29.4900"," 20.4900"," 13.4900"," 26.4900"," 53.4900"," 22.4900"," 16.4900"," 29.4900"," 27.4900"," 21.4900"," 19.4900"," 11.4900"," 12.4900"," 10.4900"," 14.4900"," 39.4900"," 13.4900",
                        " 22.4900"," 18.4900"," 39.4900"," 23.4900"," 19.4900"," 46.7500"," 12.4900"," 37.4900"," 23.4900  " };

  	order = new JButton(ordericon);
	order.setBackground(Color.yellow);
	cancel = new JButton(imhome);
	cancel.setBackground(Color.yellow);
	order.setBackground(Color.yellow);
	reset = new JButton(reseticon);
	reset.setBackground(Color.yellow);

    // Adding controls to panel
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 1;
    gb.gridy = 3;
    gf.setConstraints(labeltoyname,gb);
    shoppingpanel.add(labeltoyname);
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 4;
    gb.gridy = 3;
    gf.setConstraints(listtoyname,gb);
    shoppingpanel.add(listtoyname);
    
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 1;
    gb.gridy = 8;
    gf.setConstraints(labeltoyquantity,gb);
    shoppingpanel.add(labeltoyquantity);
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 4;
    gb.gridy = 8;
    gf.setConstraints(texttoyquantity,gb);
    shoppingpanel.add(texttoyquantity);

    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 1;
    gb.gridy = 11;
    gf.setConstraints(labeltotalcost,gb);
    shoppingpanel.add(labeltotalcost);
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 4;
    gb.gridy = 11;
    gf.setConstraints(labelcost,gb);
    shoppingpanel.add(labelcost);

    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 1;
    gb.gridy = 14;
    gf.setConstraints(labelcreditcardno,gb);
    shoppingpanel.add(labelcreditcardno);
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 4;
    gb.gridy = 14;
    gf.setConstraints(textcreditno,gb);
    shoppingpanel.add(textcreditno);

    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 1;
    gb.gridy = 17;
    gf.setConstraints(labelgiftwrap,gb);
    shoppingpanel.add(labelgiftwrap);
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 4;
    gb.gridy = 17;
    gf.setConstraints(listgiftwrap,gb);
    shoppingpanel.add(listgiftwrap);
  
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 1;
    gb.gridy = 20;
    gf.setConstraints(labelmessage,gb);
    shoppingpanel.add(labelmessage);
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 4;
    gb.gridy = 20;
    gf.setConstraints(textmessage,gb);
    shoppingpanel.add(textmessage);

    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 5;
    gb.gridy = 23;
    gf.setConstraints(order,gb);
    shoppingpanel.add(order);
    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 5;
    gb.gridy = 25;
    gf.setConstraints(cancel,gb);
    shoppingpanel.add(cancel);

    gb.anchor = GridBagConstraints.SOUTHWEST;
    gb.gridx = 5;
    gb.gridy = 27;
    gf.setConstraints(reset,gb);
    shoppingpanel.add(reset);
   
    
   
    actionperformed act = new actionperformed();
    order.addActionListener(act);
    cancel.addActionListener(act);
    reset.addActionListener(act);
    texttoyquantity.addFocusListener(act);
    }
    public void	orderok()
    {
	GridBagConstraints gbctt;
   	        GridBagLayout ggl;
   
   		 // adding layouts and constraints to panel
	   	 ggl = new GridBagLayout();
   		 gbctt = new GridBagConstraints();
	    	 okpanel.setLayout(ggl);
    
		congrats = new JLabel("Your order is registered");
		yourshopid = new JLabel("Do you wish to continue shopping? If Yes click shopping else click home...");
		//shopperidis = new JLabel("This shopping site is underconstruction and will be updated soon. Please Cooperate");
		
		congrats.setForeground(Color.red);
		yourshopid.setForeground(Color.red);
		homebutton = new JButton(imhome);
		shopbutton = new JButton(imshop);
		homebutton.setBackground(Color.orange);
		shopbutton.setBackground(Color.orange);
		actionperformed act = new actionperformed();
		homebutton.addActionListener(act);
		shopbutton.addActionListener(act);
		
		gbctt.anchor = GridBagConstraints.NORTH;
     		gbctt.gridx = 1;
    		gbctt.gridy = 5;
 		ggl.setConstraints(congrats,gbctt);
    		okpanel.add(congrats);
		
		gbctt.anchor = GridBagConstraints.NORTHWEST;
     		gbctt.gridx = 1;
    		gbctt.gridy = 8;
 		ggl.setConstraints(yourshopid,gbctt);
    		okpanel.add(yourshopid);
		
				
		gbctt.anchor = GridBagConstraints.NORTHWEST;
     		gbctt.gridx = 1;
    		gbctt.gridy = 12;
 		ggl.setConstraints(homebutton,gbctt);
    		okpanel.add(homebutton);
		
		gbctt.anchor = GridBagConstraints.NORTHWEST;
     		gbctt.gridx = 5;
    		gbctt.gridy = 12;
 		ggl.setConstraints(shopbutton,gbctt);
    		okpanel.add(shopbutton);
	}
	
   class actionperformed implements ActionListener,FocusListener
   {
     public void actionPerformed(ActionEvent e)
     {
       Object obj = e.getSource();
       if(obj == button1)
       {
              c1.show(mainpanel,"regpanel");
       }

       if(obj == loginbutton)
       {
	c1.show(mainpanel,"shoppingpanel");
        }	
	
	if(obj == acceptButton )
     	{
			String shopperid = textshopperid.getText();
			if(shopperid.length() == 0)
			{
				getAppletContext().showStatus("Please Select a Shopper ID which is necessary for logging in");
				return;
			}
			String firstname = textfirstname.getText();
			if(firstname.length() == 0)
			{
				getAppletContext().showStatus("Please enter your first name,it cannot be blank :");
				return;
			}
			String lastname = textlastname.getText();
			if(lastname.length() == 0)
			{
				getAppletContext().showStatus("Please enter your last name,it cannot be blank :");
				return;
			}
			String Password = password.getText();
			if((Password.length() == 0)||(Password.length() < 4))
			{
				getAppletContext().showStatus("Please select a PASSWORD which should be more than 4 character and enter :");
				password.setText("");
				repassword.setText("");
				return;
			}
			String rePassword = repassword.getText();
		         if(rePassword.length() == 0)
			{
				getAppletContext().showStatus("Please re type PASSWORD :");
				return;
			}
			if(! Password.equals(rePassword))
			{		getAppletContext().showStatus("PASSWORD and RE TYPE PASSWORD do not match,retry password :");
					password.setText("");
					repassword.setText("");
					return;
			}	                     
			String address = textaddress.getText();
			if(address.length() == 0)
			{
				getAppletContext().showStatus("Please enter your address,it cannot be blank :");
				return;
			}
			 String pincode = textpincode.getText();
			if(pincode.length() == 0)
			{
				getAppletContext().showStatus("Please enter your city pincode,it cannot be blank :");
				return;
			}
               		 
			String phone = textphone.getText();
			if(phone.length() == 0)
			{
				getAppletContext().showStatus("Please enter your phone number,it cannnot be blank :");
           			return;
			}
			String emailid = textemailid.getText();
    			if(emailid.length() == 0)
			{
				getAppletContext().showStatus("Please enter your e-mail ID");
				return;
			}
			
			 String city = String.valueOf(combocity.getSelectedItem());
			 String state = String.valueOf(combostate.getSelectedItem());
			 String country = String.valueOf(combocountry.getSelectedItem());
         		
			
			String creditcardno = textcreditcardno.getText();
			if((creditcardno.length() ==0))
			{
				showStatus("Please enter your CreditCardNo which will be kept Secret");
				return;
			}
			String creditcardtype = textcreditcardtype.getText();
			if((creditcardtype.length() ==0))
			{
				showStatus("Please enter your CreditCardtype");
				return;
			}
			
			String expirydate = textexpirydate.getText();
			if((creditcardtype.length() != 0)&&(expirydate.length() == 0))
			{
				getAppletContext().showStatus("Please enter your CreditCard Expiry date");
				return;
			}
			if(creditcardno.length() == 0)
			{
				textcreditcardtype.setText("");
				textcreditcardno.setText("");
				textexpirydate.setText("");
				return;
			}
			String entry = "Shopper ID: "+shopperid+","+"  First Name:  "+firstname+","+"  LastName:   "+lastname+","+"  Password:   "+Password+","+"  Address:   "+address+","+"  Pincode:   "+pincode+","+"  City:   "+city+","+"  State:   "+state+","+"  Country:   "+country+","+"  Phone No:  "+phone+","+"  E-mail ID:  "+emailid+","+"  Credit Card No:  "+creditcardno+","+"  CreditCardType:   "+creditcardtype+","+"  Expirydate:  "+expirydate+"  :";
			try
			{
				RandomAccessFile regFile = new RandomAccessFile("regfile.txt","rw");
				regFile.seek(regFile.length());
				regFile.writeBytes(entry);
			}
			catch(IOException e1)
			{
				showStatus("Cannot write in to the logfile");
			}
			if((firstname.length() != 0)&&(lastname.length() != 0)&&(address.length() !=0)&&
			(pincode.length() != 0)&&(phone.length() != 0)&& (Password.length() !=0)&&(emailid.length() !=0)&&(shopperid.length() !=0))
			{
				getAppletContext().showStatus("Please wait , your registration is being accepting :");
				
				textshopperid.setText("");
			textfirstname.setText("");
			textlastname.setText("");
			password.setText("");
			repassword.setText("");
			textaddress.setText("");
			textpincode.setText("");
			textphone.setText("");
			textemailid.setText("");
			textcreditcardno.setText("");
			textcreditcardtype.setText("");
			textexpirydate.setText("");
			getAppletContext().showStatus("");
			c1.show(mainpanel,"thankingpanel");	
			shoppersid = textshopperid.getText();
			return;
			}
			
	}
	if(obj == resetButton)
	{
			textshopperid.setText("");
			textfirstname.setText("");
			textlastname.setText("");
			password.setText("");
			repassword.setText("");
			textaddress.setText("");
			textpincode.setText("");
			textphone.setText("");
			textemailid.setText("");
			textcreditcardno.setText("");
			textcreditcardtype.setText("");
			textexpirydate.setText("");
			getAppletContext().showStatus("ALL FIELDS CLEARED,NEW VALUES CAN BE ENTERED");
			return;
			
	}
	if(obj == cancelButton)
	{
			textshopperid.setText("");
			textfirstname.setText("");
			textlastname.setText("");
			password.setText("");
			repassword.setText("");
			textaddress.setText("");
			textpincode.setText("");
			textphone.setText("");
			textemailid.setText("");
			textcreditcardno.setText("");
			textcreditcardtype.setText("");
			textexpirydate.setText("");
			c1.show(mainpanel,"loginpanel");
			getAppletContext().showStatus("");
			return;	
	}
	if(obj == homebutton)
	{
			c1.show(mainpanel,"loginpanel");
			return;
	}
	if(obj == shopbutton)
	{
			c1.show(mainpanel,"shoppingpanel");
			return;
	}
	
	if(obj == home1button)
	{
			c1.show(mainpanel,"loginpanel");
			return;
	}
	if(obj == shop1button)
	{
			c1.show(mainpanel,"shoppingpanel");
			return;
	}
	
	if(obj == order)
	{
		String toyquantity = texttoyquantity.getText();
    			
			String toyname = String.valueOf(listtoyname.getSelectedItem());
			//String wrap = String.valueOf(listgifrwrap.getSelectedItem());
			if( toyquantity.length()== 0)
			{
				getAppletContext().showStatus("Toy quantity cannot be null,Please enter the value:");
				return;
			}

			int toyqty = Integer.parseInt(toyquantity);
			if(toyqty <=0 )
			{
				getAppletContext().showStatus("Please enter a positive no ");
				return;
			}

			String creditcard = textcreditno.getText();
			if(creditcard.length() == 0)
			{
				getAppletContext().showStatus("Please enter your Creditcard NO");
				return;
			}
			
			String message = textmessage.getText();
			String wrapp = String.valueOf(listgiftwrap.getSelectedItem());
			if((wrapp.equals("Yes" )) && (message.length() == 0))
			{
				getAppletContext().showStatus("Enter the message ");
				return;
			}
			String orderentry = "Toy Name  :"+toyname+","+"  Toy Quantity  :"+toyqty+","+"CreditCardNo  :"+creditcard+","+"GiftWarp  :"+wrapp+","+"Message :"+  message+"|" ;
			try
			{
				RandomAccessFile ordFile = new RandomAccessFile("ordfile.txt","rw");
				ordFile.seek(ordFile.length());
				ordFile.writeBytes(orderentry);
			}
			catch(IOException e1)
			{
				showStatus("Cannot write in to the orderfile");
			}
			if((creditcard.length() != 0)&& (toyquantity.length() != 0))
			{
				getAppletContext().showStatus(" Please wait your order accepting ");
				
				c1.show(mainpanel,"okpanel");
				texttoyquantity.setText("");
				textcreditno.setText("");
				textmessage.setText("");
				labelcost.setText("");
				getAppletContext().showStatus("");
				return;
			}
			
			
	}
	if(obj == cancel)
	{
		
		texttoyquantity.setText("");
		textcreditno.setText("");
		textmessage.setText("");
		labelcost.setText("");
		c1.show(mainpanel,"loginpanel");
		getAppletContext().showStatus("");
		return;
	}
	if(obj == reset)
	{
		texttoyquantity.setText("");
			labelcost.setText("");
			textcreditno.setText("");
			textmessage.setText("");
			getAppletContext().showStatus("VALUES CLEARED,YOU CAN ENTER NEW VALUES NOW:");
			return;
	}
    }
	public void focusGained(FocusEvent fe)
		{	
         		getAppletContext().showStatus("Enter the a positive no and Press TAB to know the total cost :");
		}

	public void focusLost(FocusEvent fe)
		{	String quantity = texttoyquantity.getText();
			int cost = Integer.parseInt(quantity);
		  	double total = (cost*25.342);
			String totalamount = String.valueOf(total);
			labelcost.setText(totalamount);	
			getAppletContext().showStatus("The total amount for "+ quantity +" toys is Rs "+ total);
		}
	

 }
	
}