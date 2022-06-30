# Freeletics-Assignment

This assignment is written by using POM (Page Object Model) design pattern.

In **BaseClass** we have driver settings and test settings.

In **pages package** we have separate elements and methods related to each page.

In **Utils** class we have customized function that we use in test.

**For running test from command line do following steps:**

first > install maven

second > run this command: mvn -P ExecuteSingleTest test


# Second Part 

### 1. For adapting the test for an Android device, two main sections need to be changed : 

- **WebDriver** should change to **AndroidDriver**
Android driver requires capabilities for device and the browser.

- For defining the element with the PageFactory structure we need to change it a bit

  - right now the annotations are **FindBy** but it should change to **AndroidFindBy**.

  - the pagefactory parametere from **driver** should change to **AppiumFieldDecorator**.
  
  
### 2. For running the test on a real physical device: 

- You need to have and run the **Appium Server** on your laptop and Appium Settings on your device (Appium server will install it automatically)
- You need to enable **USB Debbuging** on your Android device (first you need to activate developer options)

### 3. For testing a hybrid app (web app in a native app shell), you should change the context when the web view opens to the web view.

### 4. For Navtive app you should config essential capabilities for the app : 
- PackageName or the APK path
- ActivityName 
