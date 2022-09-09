package company.a.b.c.kata.pin;

//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//
//        If the function is passed a valid PIN string, return true, else return false.
//
//        Examples (Input --> Output)
//        "1234"   -->  true
//        "12345"  -->  false
//        "a234"   -->  false

//cool solution     return pin.matches("[0-9]{4}|[0-9]{6}");
public class Pin {

    public static boolean validatePin(String pin) {

        if (pin.contains("+")) {
            return false;
        }
        if (pin.contains("-")) {
            return false;
        }

        final int length = pin.length();

        try {
            final int input = Integer.parseInt(pin);
        } catch (RuntimeException e) {
            return false;
        }
        if (length == 4 || length == 6) {
            return true;
        } else {
            return false;
        }

    }

}
