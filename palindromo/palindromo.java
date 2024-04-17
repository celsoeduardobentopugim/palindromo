[17:15, 17/04/2024] Celso Eduardo: 3
[17:16, 17/04/2024] Celso Eduardo: class Solution {
    public boolean isPalindrome(int x) {
        // Se x for negativo ou terminar com zero e não for zero, não é um palíndromo
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // Quando o comprimento do número original é ímpar, remova o último dígito do número reverso
        return x == reversed || x == reversed / 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int x1 = 121;
        System.out.println("Output for x1: " + solution.isPalindrome(x1)); // Output: true
        
        int x2 = -121;
        System.out.println("Output for x2: " + solution.isPalindrome(x2)); // Output: false
        
        int x3 = 10;
        System.out.println("Output for x3: " + solution.isPalindrome(x3)); // Output: false
    }
}