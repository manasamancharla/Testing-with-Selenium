# Testing-with-Selenium
This is a Java program that automates the process of reserving a flight on the website [BlazeDemo](https://blazedemo.com/). The program uses the Selenium library to control a Chrome browser and interact with the website.

The program first sets the path for the Chrome driver and creates a ChromeDriver object. It then opens the website and maximizes the window. The program then prints the title of the page and the number of links along with their text.

The program then selects the departure and destination cities and finds the flights. After that, it clicks on a specific flight to reserve, enters personal details, and makes the reservation.

## Known Issues
This program uses Thread.sleep() method to pause the execution of the program for a specific amount of time. Instead WebDriverWait and ExpectedConditions can be used to make the program a bit faster.
