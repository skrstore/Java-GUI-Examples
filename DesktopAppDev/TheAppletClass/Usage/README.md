# Applet Usage

Contain the methods to run a JAVA Applet.

## Methods to run Applet
1. Using Applet viewer 
    - with separate HTML file
    - embedded Applet declaration
1. Using Browser with a separate HTML file

## Method 1 - Using the Applet Viewer with separate HTML file

Step 1: Write a simple JAVA Applet Program as Following -
```java
// HelloApplet.java
import java.applet.*;
import java.awt.*;

public class HelloApplet extends Applet {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        g.drawString("Hello World of Java Applet.", 40, 20);
    }
}
``` 

Step 2: Compile the Program same as a JAVA other Program -
```bat
$ javac HelloApplet.java
```

Step 3: Now, Make a HTML file that embedded the Applet as Following -
```html
<!-- index.html -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Test the Helo World</title>
</head>

<body>
    <h1>testing the hello World</h1>
    <div>
        <APPLET CODE="HelloApplet" WIDTH="800" HEIGHT="500"></APPLET>
    </div>
</body>

</html>
```

Step 4: Now, Open the cmd and Run the follwoing command -
```bat
$ appletviewer index.html
```
This will prompt a window running the Applet.

## Method 2 - Using Applet Viewer with embedded Applet declaration 

**Step 1:** Write a simple JAVA Applet Program that contain the Applet Declaration as Following -
```java
import java.awt.*;
import java.applet.*;
// Applet Declaration
/*
<applet code="EmbddedAppletDeclaration" width=500 height=100>
</applet>
*/
public class EmbddedAppletDeclaration extends Applet {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        g.drawString("A Simple Applet, With Embdded Applet Declaration", 20, 20);
    }
}
```

**Step 2:** Now, Compile the JAVA Applet Program as follows -
```bat
$ javac EmbddedAppletDeclaration.java
```

**Step 3:** Now, Run the Applet as Follows-
```bat
$ appletviewer EmbddedAppletDeclaration.java
```
This will prompt a window running the Applet.

## Method 3 - Using the Browser to run the Applet
Only I.E. Support natively java-applet after some configuration change in the browser setting.

### **Steps:**
1. Follow `Step-1` , `Step-2`, `Step-3` of **Method 1** after which we would have following things done. 
    1. Have a Applet file(`HelloApplet.java`)
    2. Compiled the `HelloApplet.java`
    3. And, have a html file that contain the applet declaration `index.html` 
2. Open the **I.E** and enable it to run the JavaApplet
    1. Navigate to 