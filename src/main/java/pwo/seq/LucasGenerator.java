package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa służąca do generowania wyrazów ciągu Lucasa
 *
 * @author pawelp
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Ustawia wartości początkowe dla wyliczanych wyrazów.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Przywraca wartości początkowe dla wyliczanych wyrazów.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Wylicza wartość kolejnego wyrazu ciągu Lucasa.
     *
     * @return wartość kolejnego wyrazu ciągu Lucasa
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
