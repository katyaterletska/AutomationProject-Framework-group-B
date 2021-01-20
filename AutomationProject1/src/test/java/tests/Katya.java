package tests;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageClasses.Katya_POM;
import pageClasses.Katya_POM2;
import utilities.BrowserUtils;

public class Katya extends TestBase{


    
@Test
	
	public void test1UsingPOM() {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	int random1=(int)(100+Math.random()*5);
	String generatedString = RandomStringUtils.randomAlphabetic(5);
	String generatedString2 = RandomStringUtils.randomAlphabetic(10);


	
	Katya_POM page1 = new Katya_POM();
	page1.signUpButton.click();
	
	Katya_POM2 page2 = new Katya_POM2();
	
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


	
	Katya_POM expl = new Katya_POM();
	expl.signUpButton.click();
	BrowserUtils.waitFor(2); 
	
	Katya_POM2 fName = new Katya_POM2();
	fName.firstNameField.sendKeys(generatedString);
	
	
	Katya_POM2 lName = new Katya_POM2();
	lName.lastNameField.sendKeys(generatedString2);
	BrowserUtils.waitFor(2); 
	
	Katya_POM2 gender = new Katya_POM2();
	gender.genderPOM.click();
	
	Katya_POM2 aa1 = new Katya_POM2();
	aa1.a1.click();
    BrowserUtils.waitFor(2); 
    
    Katya_POM2 m = new Katya_POM2();
	m.m1.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 mm = new Katya_POM2();
	mm.m2.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 d = new Katya_POM2();
	d.d1.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 dd = new Katya_POM2();
	dd.d2.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 y = new Katya_POM2();
	y.y1.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 yy = new Katya_POM2();
	yy.y2.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 c = new Katya_POM2();
	c.c1.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 cc = new Katya_POM2();
	cc.c2.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 t = new Katya_POM2();
	t.t1.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 tt = new Katya_POM2();
	tt.t2.click();
    BrowserUtils.waitFor(2);
    
	Katya_POM2 w = new Katya_POM2();
	w.w1.sendKeys("2250 Clarendon Blvd G");
	BrowserUtils.waitFor(2); 
	
	Katya_POM2 ww = new Katya_POM2();
	ww.w2.sendKeys("Arlington");
	BrowserUtils.waitFor(2); 
	
    Katya_POM2 state = new Katya_POM2();
	state.state1.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 stateS = new Katya_POM2();
	stateS.state2.click();
    BrowserUtils.waitFor(2);
    
	Katya_POM2 r = new Katya_POM2();
	r.r1.sendKeys("22201");
	BrowserUtils.waitFor(2);
	
    Katya_POM2 rr = new Katya_POM2();
	rr.r2.click();
    BrowserUtils.waitFor(2);
    
    Katya_POM2 rrr = new Katya_POM2();
	rrr.r3.click();
    BrowserUtils.waitFor(2);
    
	Katya_POM2 n = new Katya_POM2();
	n.n1.sendKeys("703");
	BrowserUtils.waitFor(2);
	
	Katya_POM2 nn = new Katya_POM2();
	nn.n2.sendKeys("2437007");
	BrowserUtils.waitFor(2);
	
	Katya_POM2 nnn = new Katya_POM2();
	nnn.n3.sendKeys("a1j@gmail.com");
	BrowserUtils.waitFor(2);
	
	Katya_POM2 f = new Katya_POM2();
	f.f1.sendKeys("a1j@gmail"+random1+".com");
	BrowserUtils.waitFor(15);

	Katya_POM2 ff = new Katya_POM2();
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



Katya_POM expl = new Katya_POM();
expl.signUpButton.click();
BrowserUtils.waitFor(2); 

Katya_POM2 fName = new Katya_POM2();
fName.firstNameField.sendKeys(generatedString);


Katya_POM2 lName = new Katya_POM2();
lName.lastNameField.sendKeys(generatedString2);
BrowserUtils.waitFor(2); 

Katya_POM2 gender = new Katya_POM2();
gender.genderPOM.click();

Katya_POM2 aa1 = new Katya_POM2();
aa1.a1.click();
BrowserUtils.waitFor(2); 

Katya_POM2 m = new Katya_POM2();
m.m1.click();
BrowserUtils.waitFor(2);

Katya_POM2 mm = new Katya_POM2();
mm.m2.click();
BrowserUtils.waitFor(2);

Katya_POM2 d = new Katya_POM2();
d.d1.click();
BrowserUtils.waitFor(2);

Katya_POM2 dd = new Katya_POM2();
dd.d2.click();
BrowserUtils.waitFor(2);

Katya_POM2 y = new Katya_POM2();
y.y1.click();
BrowserUtils.waitFor(2);

Katya_POM2 yy = new Katya_POM2();
yy.y2.click();
BrowserUtils.waitFor(2);

Katya_POM2 traveln = new Katya_POM2();
traveln.travelN.sendKeys("123456789dfg3456789");

Katya_POM2 c = new Katya_POM2();
c.c1.click();
BrowserUtils.waitFor(2);

Katya_POM2 cc = new Katya_POM2();
cc.c2.click();
BrowserUtils.waitFor(2);

Katya_POM2 t = new Katya_POM2();
t.t1.click();
BrowserUtils.waitFor(2);

Katya_POM2 tt = new Katya_POM2();
tt.t2.click();
BrowserUtils.waitFor(2);

Katya_POM2 w = new Katya_POM2();
w.w1.sendKeys("2250 Clarendon Blvd G");
BrowserUtils.waitFor(2); 

Katya_POM2 ww = new Katya_POM2();
ww.w2.sendKeys("Arlington");
BrowserUtils.waitFor(2); 

Katya_POM2 state = new Katya_POM2();
state.state1.click();
BrowserUtils.waitFor(2);

Katya_POM2 stateS = new Katya_POM2();
stateS.state2.click();
BrowserUtils.waitFor(2);

Katya_POM2 r = new Katya_POM2();
r.r1.sendKeys("22201");
BrowserUtils.waitFor(2);

Katya_POM2 rr = new Katya_POM2();
rr.r2.click();
BrowserUtils.waitFor(2);

Katya_POM2 rrr = new Katya_POM2();
rrr.r3.click();
BrowserUtils.waitFor(2);

Katya_POM2 n = new Katya_POM2();
n.n1.sendKeys("703");
BrowserUtils.waitFor(2);

Katya_POM2 nn = new Katya_POM2();
nn.n2.sendKeys("2437007");
BrowserUtils.waitFor(2);

Katya_POM2 nnn = new Katya_POM2();
nnn.n3.sendKeys("a1j@gmail.com");
BrowserUtils.waitFor(2);

Katya_POM2 f = new Katya_POM2();
f.f1.sendKeys("a1j@gmail.com");
BrowserUtils.waitFor(2);

Katya_POM2 ff = new Katya_POM2();
ff.f2.sendKeys(random1+"aaaa1j"+ generatedString);
BrowserUtils.waitFor(2);

Katya_POM2 fff = new Katya_POM2();
fff.f3.sendKeys("Gg123Gg123"+random1);
BrowserUtils.waitFor(2);

Katya_POM2 ffff = new Katya_POM2();
ffff.f4.sendKeys("Gg123Gg123"+random1);
BrowserUtils.waitFor(2);

Katya_POM2 q = new Katya_POM2();
q.q1.click();
BrowserUtils.waitFor(2);

Katya_POM2 qq = new Katya_POM2();
qq.q2.click();
BrowserUtils.waitFor(2);

Katya_POM2 qqq = new Katya_POM2();
qqq.q3.sendKeys("Some school");
BrowserUtils.waitFor(2);

Katya_POM2 g = new Katya_POM2();
g.g1.click();
BrowserUtils.waitFor(2);

Katya_POM2 gg = new Katya_POM2();
gg.g2.click();
BrowserUtils.waitFor(2);

Katya_POM2 ggg = new Katya_POM2();
ggg.g3.sendKeys("Some name");
BrowserUtils.waitFor(2);

Katya_POM2 complete = new Katya_POM2();
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



Katya_POM expl = new Katya_POM();
expl.signUpButton.click();
BrowserUtils.waitFor(2); 

Katya_POM2 fName = new Katya_POM2();
fName.firstNameField.sendKeys("блаблабла"+generatedString);

Katya_POM2 gender = new Katya_POM2();
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



Katya_POM expl = new Katya_POM();
expl.signUpButton.click();
BrowserUtils.waitFor(2); 

Katya_POM2 fName = new Katya_POM2();
fName.firstNameField.sendKeys(generatedString);


Katya_POM2 lName = new Katya_POM2();
lName.lastNameField.sendKeys(generatedString2);
BrowserUtils.waitFor(2); 

Katya_POM2 gender = new Katya_POM2();
gender.genderPOM.click();

Katya_POM2 aa1 = new Katya_POM2();
aa1.a1.click();
BrowserUtils.waitFor(2); 

Katya_POM2 m = new Katya_POM2();
m.m1.click();
BrowserUtils.waitFor(2);

Katya_POM2 mm = new Katya_POM2();
mm.m2.click();
BrowserUtils.waitFor(2);

Katya_POM2 d = new Katya_POM2();
d.d1.click();
BrowserUtils.waitFor(2);

Katya_POM2 dd = new Katya_POM2();
dd.d2.click();
BrowserUtils.waitFor(2);

Katya_POM2 y = new Katya_POM2();
y.y1.click();
BrowserUtils.waitFor(2);

Katya_POM2 yy = new Katya_POM2();
yy.y2.click();
BrowserUtils.waitFor(2);

Katya_POM2 c = new Katya_POM2();
c.c1.click();
BrowserUtils.waitFor(2);

Katya_POM2 cc = new Katya_POM2();
cc.c2.click();
BrowserUtils.waitFor(2);

Katya_POM2 t = new Katya_POM2();
t.t1.click();
BrowserUtils.waitFor(2);

Katya_POM2 tt = new Katya_POM2();
tt.t2.click();
BrowserUtils.waitFor(2);

Katya_POM2 w = new Katya_POM2();
w.w1.sendKeys("2250 Clarendon Blvd G");
BrowserUtils.waitFor(2); 

Katya_POM2 ww = new Katya_POM2();
ww.w2.sendKeys("Arlington");
BrowserUtils.waitFor(2); 

Katya_POM2 state = new Katya_POM2();
state.state1.click();
BrowserUtils.waitFor(2);

Katya_POM2 stateS = new Katya_POM2();
stateS.state2.click();
BrowserUtils.waitFor(2);

Katya_POM2 r = new Katya_POM2();
r.r1.sendKeys("22201");
BrowserUtils.waitFor(2);

Katya_POM2 rr = new Katya_POM2();
rr.r2.click();
BrowserUtils.waitFor(2);

Katya_POM2 rrr = new Katya_POM2();
rrr.r3.click();
BrowserUtils.waitFor(2);

Katya_POM2 n = new Katya_POM2();
n.n1.sendKeys("703");
BrowserUtils.waitFor(2);

Katya_POM2 nn = new Katya_POM2();
nn.n2.sendKeys("2437007");
BrowserUtils.waitFor(2);

Katya_POM2 nnn = new Katya_POM2();
nnn.n3.sendKeys("a1j@gmail.com");
BrowserUtils.waitFor(2);

Katya_POM2 f = new Katya_POM2();
f.f1.sendKeys("a1j@gmail.com");
BrowserUtils.waitFor(2);

Katya_POM2 ff = new Katya_POM2();
ff.f2.sendKeys(random1+"aaaa1j"+ generatedString);
BrowserUtils.waitFor(2);

Katya_POM2 fff = new Katya_POM2();
fff.f3.sendKeys("Gg123Gg123"+random1);
BrowserUtils.waitFor(2);

Katya_POM2 ffff = new Katya_POM2();
ffff.f4.sendKeys("Gg123Gg123"+random1);
BrowserUtils.waitFor(2);

Katya_POM2 q = new Katya_POM2();
q.q1.click();
BrowserUtils.waitFor(2);

Katya_POM2 qq = new Katya_POM2();
qq.q2.click();
BrowserUtils.waitFor(2);

Katya_POM2 qqq = new Katya_POM2();
qqq.q3.sendKeys("Some school");
BrowserUtils.waitFor(2);

Katya_POM2 g = new Katya_POM2();
g.g1.click();
BrowserUtils.waitFor(2);

Katya_POM2 gg = new Katya_POM2();
gg.g2.click();
BrowserUtils.waitFor(2);

Katya_POM2 ggg = new Katya_POM2();
ggg.g3.sendKeys("Some name");
BrowserUtils.waitFor(2);


WebElement select = driver.findElement(By.id("newsOffersUpdate"));
select.click();
BrowserUtils.waitFor(5);

Katya_POM2 complete = new Katya_POM2();
complete.complete1.click();
BrowserUtils.waitFor(2);


if(driver.getCurrentUrl().equals("https://www.delta.com/myprofile/personal-details?from=smenrollment")) {
			System.out.println("Test5: PASS");
		}else {
			System.out.println("Test5: FAIL");
		}
}

}
