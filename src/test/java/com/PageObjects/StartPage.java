package com.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.BaseClass;
import com.utils.Helper;
import com.utils.Loggerload;
import com.utils.Utils;

public class StartPage extends BaseClass {
	
	public StartPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);		
	}
	
	@FindBy(xpath = "//button[text()='Get Started']") 	
	@CacheLookup 	WebElement getStartedBtn;
	
	@FindBy(xpath = "//a[text()='NumpyNinja']") 	
	@CacheLookup 	WebElement homePageTitle;
	
	@FindBy(xpath="//a[text()='Data Structures']") 	
	@CacheLookup 	WebElement dropDownLink;	
	@FindBy (xpath="//a[text()='Arrays']") 	
	@CacheLookup 	WebElement dropdown_array;	
	@FindBy (xpath="//a[text()='Linked List']") 
	@CacheLookup 	WebElement dropdown_linkedlist;	
	@FindBy (xpath="//a[text()='Stack']")	
	@CacheLookup 	WebElement dropdown_stack;	
	@FindBy (xpath="//a[text()='Queue']") 	
	@CacheLookup WebElement dropdown_queue;	
	@FindBy (xpath="//a[text()='Tree']") 	
	@CacheLookup 	WebElement dropdown_tree;	
	@FindBy (xpath="//a[text()='Graph']") 	
	@CacheLookup 	WebElement dropdown_graph;
	
	@FindBy(xpath = "//div[@class = 'alert alert-primary']")
	@CacheLookup  	WebElement startPageErrorMsg;;
	
	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']") 
	@CacheLookup  WebElement getStartedBtn_DS;	
	@FindBy(xpath = "//h5[text()='Array']/..//a[text()='Get Started']") 	
	@CacheLookup  WebElement getStartedBtn_array;
	@FindBy(xpath = "//h5[text()=Linked List']/..//a[text()='Get Started']") 
	@CacheLookup 	WebElement getStartedBtn_linkedlist;
	@FindBy(xpath = "//h5[text()='Stack']/..//a[text()='Get Started']") 
	@CacheLookup 	WebElement getStartedBtn_stack;
	@FindBy(xpath = "//h5[text()='Queue']/..//a[text()='Get Started']") 
	@CacheLookup 	WebElement getStartedBtn_queue;
	@FindBy(xpath = "//h5[text()='Tree']/..//a[text()='Get Started']") 	
	@CacheLookup 	WebElement getStartedBtn_tree;	
	@FindBy (xpath="//h5[text()='Graph']/..//a[text()='Get Started']")  
	@CacheLookup    WebElement getStartedBtn_graph;
	
	
	public void clickGetStartedBtn() throws Exception {
		 Loggerload.info("Clicked on  "+getStartedBtn.getText()+" button in Start page");
		 Utils.webClick(getStartedBtn);
    }
	 
	public String validateHomePage() {
		Loggerload.info("The title of the home page is: "+homePageTitle.getText());
		String text = homePageTitle.getText();
		return text;
    }
	 
	public void dropDownClick() throws InterruptedException {
		 //Thread.sleep(1000);
		 Loggerload.info("Clicked on  "+dropDownLink.getText()+" drop down");
		 Utils.webClick(dropDownLink); 
    }
	 
	public void enterDropdownValue(String value) throws InterruptedException {
		switch (value) {
		case "Arrays":
			Loggerload.info("User click on " + dropdown_array.getText() + " option in drop down");
			//Utils.webSendKeys(dropdown_array, value);
			 Utils.webClick(dropdown_array);
			break;
		case "Linkedlist":
			Loggerload.info("User click on " + dropdown_linkedlist.getText() + " option in drop down");
			//Utils.webSendKeys(dropdown_linkedlist, value);
			 Utils.webClick(dropdown_linkedlist);
			break;
		case "Stack":
			Loggerload.info("User click on " + dropdown_stack.getText() + " option in drop down");
			//Utils.webSendKeys(dropdown_stack, value);
			 Utils.webClick(dropdown_stack);
			 break;
		case "Queue":
			Loggerload.info("User click on " + dropdown_queue.getText() + " option in drop down");
			//Utils.webSendKeys(dropdown_queue, value);
			 Utils.webClick(dropdown_queue);
			break;
		case "Tree":
			Loggerload.info("User click on " + dropdown_tree.getText() + " option in drop down");
			//Utils.webSendKeys(dropdown_tree, value);
			 Utils.webClick(dropdown_tree);
			break;
		case "Graph":
			Loggerload.info("User click on " +dropdown_graph.getText() + " option in drop down");
			//Utils.webSendKeys(dropdown_graph, value);
			 Utils.webClick(dropdown_graph);
			break;
		}
}
	 
	public String displayErrorMsg() {
		String text= startPageErrorMsg.getText();
		return text;
    }
	 
	public void getStarted_home(String string) {
		PageFactory.initElements(Helper.getDriver(), this);
		switch (string) {
		case "Datastructures":
			Loggerload.info("Click on " + getStartedBtn_DS.getText() + "  in DataStructures section ");
			//Utils.webSendKeys(getStartedBtn_DS, string);
			getStartedBtn_DS.click();
			break;
		case "Arrays":
			Loggerload.info("Click " + getStartedBtn_array.getText() + " in Array section");
			//Utils.webSendKeys(getStartedBtn_array, string);
			getStartedBtn_array.click();
			break;
		case "Linkedlist":
			Loggerload.info("click " + getStartedBtn_linkedlist.getText() + " in LinkedList section");
			//Utils.webSendKeys(getStartedBtn_linkedlist, string);
			getStartedBtn_linkedlist.click();
			break;
		case "Stack":
			Loggerload.info("click " + getStartedBtn_stack.getText() + "link on stack");
			//Utils.webSendKeys(getStartedBtn_stack, string);
			getStartedBtn_stack.click();
			break;
		case "Queue":
			Loggerload.info("click " + getStartedBtn_queue.getText() + "link on queue ");
			//Utils.webSendKeys(getStartedBtn_queue, string);
			getStartedBtn_queue.click();
			break;
		case "Tree":
			Loggerload.info("click " + getStartedBtn_tree.getText() + "link on Tree ");
			//Utils.webSendKeys(getStartedBtn_tree, string);
			getStartedBtn_tree.click();
			break;
		case "Graph":
			Loggerload.info("Click " + getStartedBtn_graph.getText() + " button on Graph ");
			//Utils.webSendKeys(getStartedBtn_graph, string);
			//Utils.webClick(getStartedBtn_graph);
			getStartedBtn_graph.click();
			System.out.println("Clicked on Graph Get started button.");
			break;
		}
	}
}