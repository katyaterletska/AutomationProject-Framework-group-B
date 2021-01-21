package tests;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import pageClasses.KatyaSignUpPage;
import utilities.BrowserUtils;

public class KatyaSprint1 extends TestBase{


    
@Test
	
	public void test1UsingPOM() {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	int random1=(int)(100+Math.random()*5);
	String generatedString = RandomStringUtils.randomAlphabetic(5);
	String generatedString2 = RandomStringUtils.randomAlphabetic(10);


	

	
	KatyaSignUpPage page2 = new KatyaSignUpPage();
	page2.signUpButton.click();
	page2.firstNameField.sendKeys(generatedString);	
	page2.lastNameField.sendKeys(generatedString2);	
	page2.genderPOM.click();
	page2.a1.click();     
    page2.m1.click();    
    page2.m2.click();
    page2.d1.click();
    page2.d2.click();
    page2.y1.click();
    page2.y2.click();
    page2.c1.click();
    page2.c2.click();
    page2.t1.click();
    page2.t2.click();
   	page2.w1.sendKeys("2250 Clarendon Blvd G");
	page2.w2.sendKeys("Arlington");
    page2.state1.click();
    page2.state2.click();
  	page2.r1.sendKeys("22201");
	page2.r2.click();
    page2.r3.click();
  	page2.n1.sendKeys("703");
	page2.n2.sendKeys("2437007");
	page2.n3.sendKeys("a1j@gmail.com");
	page2.f1.sendKeys("a1j@gmail.com");
	page2.f2.sendKeys(random1+"aaaa1j"+ generatedString);
	page2.f3.sendKeys("Gg123Gg123"+random1);
	page2.f4.sendKeys("Gg123Gg123"+random1);
	page2.q1.click();
   	page2.q2.click();
    page2.q3.sendKeys("Some school");
	page2.g1.click();
    page2.g2.click();
    page2.g3.sendKeys("Some name");
	page2.complete1.click();
        

    if(driver.getCurrentUrl().equals("https://www.delta.com/myprofile/personal-details?from=smenrollment")) {
  			System.out.println("Test1: PASS");
  		}else {
  			System.out.println("Test1 FAIL");
  		}
}
    
@Test
	
	public void test2UsingPOM() {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	int random1=(int)(100+Math.random()*5);
	String generatedString = RandomStringUtils.randomAlphabetic(5);
	String generatedString2 = RandomStringUtils.randomAlphabetic(10);


 

	
	KatyaSignUpPage page2 = new KatyaSignUpPage();
	page2.signUpButton.click();
	
	KatyaSignUpPage fName = new KatyaSignUpPage();
	fName.firstNameField.sendKeys(generatedString);
	
	
	KatyaSignUpPage lName = new KatyaSignUpPage();
	lName.lastNameField.sendKeys(generatedString2);
	BrowserUtils.waitFor(2); 
	
	KatyaSignUpPage gender = new KatyaSignUpPage();
	gender.genderPOM.click();
	
	KatyaSignUpPage aa1 = new KatyaSignUpPage();
	aa1.a1.click();
    BrowserUtils.waitFor(2); 
    
    KatyaSignUpPage m = new KatyaSignUpPage();
	m.m1.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage mm = new KatyaSignUpPage();
	mm.m2.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage d = new KatyaSignUpPage();
	d.d1.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage dd = new KatyaSignUpPage();
	dd.d2.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage y = new KatyaSignUpPage();
	y.y1.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage yy = new KatyaSignUpPage();
	yy.y2.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage c = new KatyaSignUpPage();
	c.c1.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage cc = new KatyaSignUpPage();
	cc.c2.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage t = new KatyaSignUpPage();
	t.t1.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage tt = new KatyaSignUpPage();
	tt.t2.click();
    BrowserUtils.waitFor(2);
    
	KatyaSignUpPage w = new KatyaSignUpPage();
	w.w1.sendKeys("2250 Clarendon Blvd G");
	BrowserUtils.waitFor(2); 
	
	KatyaSignUpPage ww = new KatyaSignUpPage();
	ww.w2.sendKeys("Arlington");
	BrowserUtils.waitFor(2); 
	
    KatyaSignUpPage state = new KatyaSignUpPage();
	state.state1.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage stateS = new KatyaSignUpPage();
	stateS.state2.click();
    BrowserUtils.waitFor(2);
    
	KatyaSignUpPage r = new KatyaSignUpPage();
	r.r1.sendKeys("22201");
	BrowserUtils.waitFor(2);
	
    KatyaSignUpPage rr = new KatyaSignUpPage();
	rr.r2.click();
    BrowserUtils.waitFor(2);
    
    KatyaSignUpPage rrr = new KatyaSignUpPage();
	rrr.r3.click();
    BrowserUtils.waitFor(2);
    
	KatyaSignUpPage n = new KatyaSignUpPage();
	n.n1.sendKeys("703");
	BrowserUtils.waitFor(2);
	
	KatyaSignUpPage nn = new KatyaSignUpPage();
	nn.n2.sendKeys("2437007");
	BrowserUtils.waitFor(2);
	
	KatyaSignUpPage nnn = new KatyaSignUpPage();
	nnn.n3.sendKeys("a1j@gmail.com");
	BrowserUtils.waitFor(2);
	
	KatyaSignUpPage f = new KatyaSignUpPage();
	f.f1.sendKeys("a1j@gmail"+random1+".com");
	BrowserUtils.waitFor(15);

	KatyaSignUpPage ff = new KatyaSignUpPage();
	ff.f2.click();
	BrowserUtils.waitFor(2);

    String actualErr = driver.findElement(By.xpath("//label[@class='errIcon'][contains(text(),'*CONFIRM EMAIL ADDRESS')]")).getText();
    //System.out.println(actualErr);
	String expectedErr = "*CONFIRM EMAIL ADDRESS";
	
	if (actualErr.contains(expectedErr)) {
		System.out.println("Test2: PASS");
	}else {
		System.out.println("Test2: FAIL");
	}
}


@Test

public void test3UsingPOM() {

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
int random1=(int)(100+Math.random()*5);
String generatedString = RandomStringUtils.randomAlphabetic(5);
String generatedString2 = RandomStringUtils.randomAlphabetic(10);




KatyaSignUpPage page2 = new KatyaSignUpPage();
page2.signUpButton.click();

KatyaSignUpPage fName = new KatyaSignUpPage();
fName.firstNameField.sendKeys(generatedString);


KatyaSignUpPage lName = new KatyaSignUpPage();
lName.lastNameField.sendKeys(generatedString2);
BrowserUtils.waitFor(2); 

KatyaSignUpPage gender = new KatyaSignUpPage();
gender.genderPOM.click();

KatyaSignUpPage aa1 = new KatyaSignUpPage();
aa1.a1.click();
BrowserUtils.waitFor(2); 

KatyaSignUpPage m = new KatyaSignUpPage();
m.m1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage mm = new KatyaSignUpPage();
mm.m2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage d = new KatyaSignUpPage();
d.d1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage dd = new KatyaSignUpPage();
dd.d2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage y = new KatyaSignUpPage();
y.y1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage yy = new KatyaSignUpPage();
yy.y2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage traveln = new KatyaSignUpPage();
traveln.travelN.sendKeys("123456789dfg3456789");

KatyaSignUpPage c = new KatyaSignUpPage();
c.c1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage cc = new KatyaSignUpPage();
cc.c2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage t = new KatyaSignUpPage();
t.t1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage tt = new KatyaSignUpPage();
tt.t2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage w = new KatyaSignUpPage();
w.w1.sendKeys("2250 Clarendon Blvd G");
BrowserUtils.waitFor(2); 

KatyaSignUpPage ww = new KatyaSignUpPage();
ww.w2.sendKeys("Arlington");
BrowserUtils.waitFor(2); 

KatyaSignUpPage state = new KatyaSignUpPage();
state.state1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage stateS = new KatyaSignUpPage();
stateS.state2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage r = new KatyaSignUpPage();
r.r1.sendKeys("22201");
BrowserUtils.waitFor(2);

KatyaSignUpPage rr = new KatyaSignUpPage();
rr.r2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage rrr = new KatyaSignUpPage();
rrr.r3.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage n = new KatyaSignUpPage();
n.n1.sendKeys("703");
BrowserUtils.waitFor(2);

KatyaSignUpPage nn = new KatyaSignUpPage();
nn.n2.sendKeys("2437007");
BrowserUtils.waitFor(2);

KatyaSignUpPage nnn = new KatyaSignUpPage();
nnn.n3.sendKeys("a1j@gmail.com");
BrowserUtils.waitFor(2);

KatyaSignUpPage f = new KatyaSignUpPage();
f.f1.sendKeys("a1j@gmail.com");
BrowserUtils.waitFor(2);

KatyaSignUpPage ff = new KatyaSignUpPage();
ff.f2.sendKeys(random1+"aaaa1j"+ generatedString);
BrowserUtils.waitFor(2);

KatyaSignUpPage fff = new KatyaSignUpPage();
fff.f3.sendKeys("Gg123Gg123"+random1);
BrowserUtils.waitFor(2);

KatyaSignUpPage ffff = new KatyaSignUpPage();
ffff.f4.sendKeys("Gg123Gg123"+random1);
BrowserUtils.waitFor(2);

KatyaSignUpPage q = new KatyaSignUpPage();
q.q1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage qq = new KatyaSignUpPage();
qq.q2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage qqq = new KatyaSignUpPage();
qqq.q3.sendKeys("Some school");
BrowserUtils.waitFor(2);

KatyaSignUpPage g = new KatyaSignUpPage();
g.g1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage gg = new KatyaSignUpPage();
gg.g2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage ggg = new KatyaSignUpPage();
ggg.g3.sendKeys("Some name");
BrowserUtils.waitFor(2);

KatyaSignUpPage complete = new KatyaSignUpPage();
complete.complete1.click();
BrowserUtils.waitFor(10);

if(driver.getCurrentUrl().equals("https://www.delta.com/myprofile/personal-details?from=smenrollment")) {
		System.out.println("Test3: FAIL");
	}else {
		System.out.println("Test3: PASS");
	}
}
	

@Test

public void test4UsingPOM() {

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
String generatedString = RandomStringUtils.randomAlphabetic(5);





KatyaSignUpPage page2 = new KatyaSignUpPage();
page2.signUpButton.click();

KatyaSignUpPage fName = new KatyaSignUpPage();
fName.firstNameField.sendKeys("блаблабла"+generatedString);

KatyaSignUpPage gender = new KatyaSignUpPage();
gender.genderPOM.click();

String actualErr = driver.findElement(By.xpath("//label[@class='errIcon'][contains(text(),'*FIRST NAME')]")).getText();
//System.out.println(actualErr);
String expectedErr = "*FIRST NAME";

if (actualErr.contains(expectedErr)) {
	System.out.println("Test4: PASS");
}else {
	System.out.println("Test4: FAIL");
}
}

@Test

public void test5UsingPOM() {

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
int random1=(int)(100+Math.random()*5);
String generatedString = RandomStringUtils.randomAlphabetic(5);
String generatedString2 = RandomStringUtils.randomAlphabetic(10);




KatyaSignUpPage page2 = new KatyaSignUpPage();
page2.signUpButton.click();

KatyaSignUpPage fName = new KatyaSignUpPage();
fName.firstNameField.sendKeys(generatedString);


KatyaSignUpPage lName = new KatyaSignUpPage();
lName.lastNameField.sendKeys(generatedString2);
BrowserUtils.waitFor(2); 

KatyaSignUpPage gender = new KatyaSignUpPage();
gender.genderPOM.click();

KatyaSignUpPage aa1 = new KatyaSignUpPage();
aa1.a1.click();
BrowserUtils.waitFor(2); 

KatyaSignUpPage m = new KatyaSignUpPage();
m.m1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage mm = new KatyaSignUpPage();
mm.m2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage d = new KatyaSignUpPage();
d.d1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage dd = new KatyaSignUpPage();
dd.d2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage y = new KatyaSignUpPage();
y.y1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage yy = new KatyaSignUpPage();
yy.y2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage c = new KatyaSignUpPage();
c.c1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage cc = new KatyaSignUpPage();
cc.c2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage t = new KatyaSignUpPage();
t.t1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage tt = new KatyaSignUpPage();
tt.t2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage w = new KatyaSignUpPage();
w.w1.sendKeys("2250 Clarendon Blvd G");
BrowserUtils.waitFor(2); 

KatyaSignUpPage ww = new KatyaSignUpPage();
ww.w2.sendKeys("Arlington");
BrowserUtils.waitFor(2); 

KatyaSignUpPage state = new KatyaSignUpPage();
state.state1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage stateS = new KatyaSignUpPage();
stateS.state2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage r = new KatyaSignUpPage();
r.r1.sendKeys("22201");
BrowserUtils.waitFor(2);

KatyaSignUpPage rr = new KatyaSignUpPage();
rr.r2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage rrr = new KatyaSignUpPage();
rrr.r3.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage n = new KatyaSignUpPage();
n.n1.sendKeys("703");
BrowserUtils.waitFor(2);

KatyaSignUpPage nn = new KatyaSignUpPage();
nn.n2.sendKeys("2437007");
BrowserUtils.waitFor(2);

KatyaSignUpPage nnn = new KatyaSignUpPage();
nnn.n3.sendKeys("a1j@gmail.com");
BrowserUtils.waitFor(2);

KatyaSignUpPage f = new KatyaSignUpPage();
f.f1.sendKeys("a1j@gmail.com");
BrowserUtils.waitFor(2);

KatyaSignUpPage ff = new KatyaSignUpPage();
ff.f2.sendKeys(random1+"aaaa1j"+ generatedString);
BrowserUtils.waitFor(2);

KatyaSignUpPage fff = new KatyaSignUpPage();
fff.f3.sendKeys("Gg123Gg123"+random1);
BrowserUtils.waitFor(2);

KatyaSignUpPage ffff = new KatyaSignUpPage();
ffff.f4.sendKeys("Gg123Gg123"+random1);
BrowserUtils.waitFor(2);

KatyaSignUpPage q = new KatyaSignUpPage();
q.q1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage qq = new KatyaSignUpPage();
qq.q2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage qqq = new KatyaSignUpPage();
qqq.q3.sendKeys("Some school");
BrowserUtils.waitFor(2);

KatyaSignUpPage g = new KatyaSignUpPage();
g.g1.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage gg = new KatyaSignUpPage();
gg.g2.click();
BrowserUtils.waitFor(2);

KatyaSignUpPage ggg = new KatyaSignUpPage();
ggg.g3.sendKeys("Some name");
BrowserUtils.waitFor(2);


WebElement select = driver.findElement(By.id("newsOffersUpdate"));
select.click();
BrowserUtils.waitFor(5);

KatyaSignUpPage complete = new KatyaSignUpPage();
complete.complete1.click();
BrowserUtils.waitFor(2);


if(driver.getCurrentUrl().equals("https://www.delta.com/myprofile/personal-details?from=smenrollment")) {
			System.out.println("Test5: PASS");
		}else {
			System.out.println("Test5: FAIL");
		}
}

}
