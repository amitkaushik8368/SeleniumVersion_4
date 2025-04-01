package org.pratima.SeleniumPractice03;

public class SeleniumMethodsLinkedIn
{
//    1. WebDriver Class
//
//    This is the main class that interacts with the browser.
//
//    Common Methods:
//
//    get(url): Opens a webpage.
//
//        quit(): Closes all browser windows and ends the session.
//
//    close(): Closes the current browser window.
//
//        maximize_window(): Maximizes the browser window.
//
//    get_title(): Gets the page title.
//
//
//
//        ---
//
//        2. WebElement Class
//
//    Represents an element on the web page.
//
//    Common Methods:
//
//    click(): Clicks on an element.
//
//    send_keys(text): Enters text into an input field.
//
//    clear(): Clears text from an input field.
//
//    get_attribute(name): Gets an attribute’s value.
//
//    is_displayed(): Checks if an element is visible.
//
//    is_enabled(): Checks if an element is enabled.
//
//
//
//        ---
//
//        3. By Class
//
//    Used to locate elements on a webpage.
//
//    Common Methods:
//
//        By.ID("id")
//
//        By.NAME("name")
//
//        By.CLASS_NAME("class")
//
//        By.TAG_NAME("tag")
//
//        By.LINK_TEXT("link text")
//
//        By.PARTIAL_LINK_TEXT("partial link text")
//
//        By.CSS_SELECTOR("css selector")
//
//        By.XPATH("xpath")
//
//
//
//        ---
//
//        4. Select Class
//
//    Used for handling <select> dropdowns.
//
//    Common Methods:
//
//    select_by_visible_text("text")
//
//    select_by_value("value")
//
//    select_by_index(index)
//
//    deselect_all()
//
//
//
//---
//
//        5. Actions Class
//
//    Used for mouse and keyboard interactions.
//
//    Common Methods:
//
//    move_to_element(element): Moves the mouse to an element.
//
//    click(element): Clicks on an element.
//
//    double_click(element): Double-clicks an element.
//
//        context_click(element): Right-clicks an element.
//
//        send_keys(keys): Sends keyboard keys.
//
//
//
//---
//
//        6. Alert Class
//
//    Handles JavaScript alerts.
//
//    Common Methods:
//
//    accept(): Clicks "OK".
//
//    dismiss(): Clicks "Cancel".
//
//    send_keys(text): Enters text into a prompt alert.
//
//    text(): Retrieves alert message.
//
//
//
//---
//
//        7. WebDriverWait Class (Explicit Waits)
//
//    Used for waiting until an element meets a condition.
//
//    Common Method:
//
//    WebDriverWait(driver, timeout).until(condition): Waits for a condition.
//
//
//    Example Condition (from expected_conditions module):
//
//    element_to_be_clickable((By.ID, "id"))
//
//    presence_of_element_located((By.XPATH, "xpath"))
}
