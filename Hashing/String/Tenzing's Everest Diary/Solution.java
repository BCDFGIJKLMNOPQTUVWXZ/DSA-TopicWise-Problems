public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    sc.nextLine(); // Consume the leftover newline character
    System.out.println("Number of test cases: " + T); // Debug statement

    HashMap<String, Integer> hmap = new HashMap<>();
    hmap.put("JAN", 0);
    hmap.put("FEB", 31);
    hmap.put("MAR", 59);
    hmap.put("APR", 90);
    hmap.put("MAY", 120);
    hmap.put("JUN", 151);
    hmap.put("JUL", 181);
    hmap.put("AUG", 212);
    hmap.put("SEP", 243);
    hmap.put("OCT", 273);
    hmap.put("NOV", 304);
    hmap.put("DEC", 334);

    for (int t = 0; t < T; t++) {
        String S = sc.nextLine().trim(); // Trim any leading/trailing spaces
        System.out.println("Processing input: " + S); // Debug statement

        int DD = Integer.parseInt(S.substring(0, 2)); // Extract day
        String MMM = S.substring(2); // Extract month

        if (hmap.containsKey(MMM)) {
            int days = hmap.get(MMM) + DD;
            System.out.println(days);
        } else {
            System.out.println("Invalid month: " + MMM); // Debug invalid month
        }
    }
    sc.close();
}
