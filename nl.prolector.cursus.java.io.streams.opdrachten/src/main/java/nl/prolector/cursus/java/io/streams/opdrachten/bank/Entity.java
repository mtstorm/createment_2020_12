package nl.prolector.cursus.java.io.streams.opdrachten.bank;

public interface Entity<E extends Entity<E, OID>, OID extends Comparable<OID>> {
	OID getOid();

	boolean isIdentical(E that);

	boolean isPersistent();
}
