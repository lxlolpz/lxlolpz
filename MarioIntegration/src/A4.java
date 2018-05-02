//Inheritance subclass
/**Subclass from Audi class.
 * @author Lalo
 *
 */
public class A4 extends Audi {
  /* (non-Javadoc)
   * @see Audi#model()
   */
  @Override
  public void model() {
    System.out.println("Audi A4");
  }

  /* (non-Javadoc)
   * @see Audi#engine()
   */
  @Override
  public void engine() {
    System.out.println("2.0 L 4-cylinder");
  }
}
