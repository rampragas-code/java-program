// OOPS IS USED FOR MODULARPROGRAMMING
/* - CODE REAUSIBILITY
 * -FOR NOT BEING A KACHARA PROGRAMMER
 * - TO MAKE MODULU(DIFFERENT THING FOR DIFFERENT WORK)
 * - CODE MANAGEMENTS
 * 
 * CLASS IS FACTORY PRODUCING OBJECTS. CLASS IS A BLUEPRINT OR TEMPLETES.
 * ANY REAL WORLD IS OBJECTS
 * 
 * CLASS AND OBJECT IS USED FOR DOM MODEL . -CLASS FOR ADMIN -CLASS FOR CUSTOER
 */
class Lamp {
  
    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;
  
    // method to turn on the light
    void turnOn() {
      isOn = true;
      System.out.println("Light on? " + isOn);
  
    }
  
    // method to turnoff the light
    void turnOff() {
      isOn = false;
      System.out.println("Light on? " + isOn);
    }
  }
  
  class Main {
    public static void main(String[] args) {
  
      // create objects led and halogen
      Lamp led = new Lamp();
      Lamp halogen = new Lamp();
  
      // turn on the light by
      // calling method turnOn()
      led.turnOn();
  
      // turn off the light by
      // calling method turnOff()
      halogen.turnOff();
    }
  }