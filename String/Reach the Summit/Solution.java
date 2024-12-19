import java.util.Scanner;
public class RockClimbingInstructions{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      for(int t=1; t<=T; t++){
          int x=sc.nextInt();
          int y=sc.nextInt();
          sc.nextLine();
  
          String S=sc.nextLine();
          int i=0;
          while(i<S.length()){
             char direction = s.charAt(i); // Get the direction
                i++;

                // Parse the distance
                int distance = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    distance = distance * 10 + (s.charAt(i) - '0');
                    i++;
                }
          }
           // Update coordinates based on direction
          switch (direction) {
                    case 'U': y += distance; break;
                    case 'D': y -= distance; break;
                    case 'R': x += distance; break;
                    case 'L': x -= distance; break;
                }
            }

            // Calculate Euclidean distance from the origin
            double euclideanDistance = Math.sqrt((long) x * x + (long) y * y);

            // Print result rounded to 2 decimal places
            System.out.printf("%.2f%n", euclideanDistance);
        }

        sc.close();
}
