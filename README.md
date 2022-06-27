# Welcome to SARE!
SARE is a highly customizable and barebones rendering engine based around the developer.
The concept of SARE is that the developer doesn't import SARE as a library, but rather modifies SARE's code to
fit their needs. The current code in paintComponent() illustrates a simple Hello World with a red background


The Renderer class is what actually does all the rendering, you would add all your rendering code in there
SARE also has a convenient TextUtil class which eases some of the annoyances of rendering text in Swing.


SARE is built with multithreading in mind, which is why the example below uses it.
SARE has an event queue, which gets executed in a way which solves concurrency issues.
To use it simply call the RenderEngine.addEventToQueue() method and pass in an Event.

## Events
Events are simply objects which implement the Event class.
Any code that is put inside the run() function of an event will be executed in the event queue

## Note
To use a Logger, you must replace any calls to System.out.println() in the code, I am aware that this
is tedious however I am unaware of a better way to do it


If you encounter any issues with SARE, feel free to open an issue on Github


DISCLAIMER: I am by no means a great Java developer, if certain sections of code can be written way better, let me know! Or even open a pull request!

# How to use
To use SARE, copy the render package into your project where you see fit.
