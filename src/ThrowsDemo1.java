public class ThrowsDemo1 {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo1 demo = new ThrowsDemo1();
        demo.getDetails(null);
    }
}