package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa służąca do generowania wyrazów ciągu Tribonacciego
 *
 * @author pawelp
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * Ustawia wartości początkowe dla wyliczanych wyrazów.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Przywraca wartości początkowe dla wyliczanych wyrazów.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Wylicza wartość kolejnego wyrazu ciągu Tribonaciego.
     *
     * @return wartość kolejnego wyrazu ciągu Tribonacciego
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
