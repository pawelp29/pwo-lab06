package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa służąca do generowania wyrazów ciągu Fibonacciego
 *
 * @author pawelp
 */
public class FibonacciGenerator extends Generator {

    /**
     * Ustawia wartości początkowe dla wyliczanych wyrazów.
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Przywraca wartości początkowe dla wyliczanych wyrazów.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Wylicza wartość kolejnego wyrazu ciągu Fibonaciego.
     *
     * @return wartość kolejnego wyrazu ciągu Fibonacciego
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
