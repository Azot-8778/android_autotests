@Test
public void validRegistrationTest()
{
   WebElement emailInput = driver.findElementById("com.example.login:id/username");

   emailInput.isDisplayed();
   emailInput.click();
   emailInput.sendKeys("user@user.ru");

   WebElement passInput = driver.findElementById("com.example.login:id/password");

   passInput.isDisplayed();
   passInput.click();
   passInput.sendKeys("1111");

   WebElement signInButton = driver.findElementById("com.example.login:id/login");

   signInButton.isDisplayed();
   signInButton.click();

   WebElement successAuthText = driver.findElementByXPath("//*[contains(@text, 'Login failed')]");
   successAuthText.isDisplayed();
}