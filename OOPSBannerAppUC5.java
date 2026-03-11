public class OOPSBannerAppUC5 {
    public static void main(String[] args) {
        //  O        O        P        S
        String[] bannerLines = {
            String.join("  ", " *** ", " *** ", "**** ", " *** "),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "**** ", " *** "),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", " *** ", " *** ", "*    ", " *** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}