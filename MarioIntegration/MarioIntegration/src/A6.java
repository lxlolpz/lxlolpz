
/**Subclass from Audi.
 * @author Lalo
 *
 */
//Inheritance subclass
public class A6 extends Audi {
  /* (non-Javadoc)
   * @see Audi#model()
   */
  @Override
  public void model() {
    System.out.println("Audi A6");
  }

  /* (non-Javadoc)
   * @see Audi#engine()
   */
  @Override
  public void engine() {
    System.out.println("3.0 L Supercharged V6");
  }
}
