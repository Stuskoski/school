package test_randoop_pre;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.Money;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }


    core.Money money3 = core.Money.dollars(10.0d);
    core.Money money5 = core.Money.dollars(10.0d);
    core.Money money7 = core.Money.dollars(10.0d);
    java.lang.String str8 = money7.toString();
    java.math.BigDecimal bigDecimal9 = money7.amount();
    core.Money money10 = money5.add(money7);
    core.Money money11 = money3.subtract(money5);
    core.Money money13 = core.Money.dollars(10.0d);
    boolean b14 = money11.equals(money13);
    java.lang.String str15 = money11.toString();
    java.util.Currency currency16 = money11.getCurrency();
    core.Money money17 = new core.Money(10L, currency16);
    core.Money money18 = new core.Money(90.0d, currency16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "$10.00"+ "'", str8.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$0.00"+ "'", str15.equals("$0.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency16);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }


    core.Money money7 = core.Money.dollars(10.0d);
    java.lang.String str8 = money7.toString();
    java.math.BigDecimal bigDecimal9 = money7.amount();
    core.Money[] money_array11 = money7.divide(1);
    boolean b13 = money7.equals((java.lang.Object)(-1.0d));
    core.Money money15 = core.Money.dollars(10.0d);
    java.lang.String str16 = money15.toString();
    java.math.BigDecimal bigDecimal17 = money15.amount();
    java.util.Currency currency18 = money15.getCurrency();
    money7.setCurrency(currency18);
    core.Money money20 = new core.Money(10.0d, currency18);
    core.Money money21 = new core.Money(1.0d, currency18);
    core.Money money22 = new core.Money(10.0d, currency18);
    core.Money money23 = new core.Money(100L, currency18);
    core.Money money24 = new core.Money(10.0d, currency18);
    core.Money money26 = core.Money.dollars(10.0d);
    java.lang.String str27 = money26.toString();
    core.Money money29 = core.Money.dollars(10.0d);
    java.lang.String str30 = money29.toString();
    java.math.BigDecimal bigDecimal31 = money29.amount();
    core.Money[] money_array33 = money29.divide(10);
    boolean b34 = money26.equals((java.lang.Object)money29);
    core.Money money36 = core.Money.dollars(10.0d);
    core.Money money38 = core.Money.dollars(10.0d);
    java.lang.String str39 = money38.toString();
    java.math.BigDecimal bigDecimal40 = money38.amount();
    core.Money money41 = money36.add(money38);
    core.Money money42 = money29.add(money41);
    core.Money money44 = core.Money.dollars(10.0d);
    core.Money money46 = core.Money.dollars(10.0d);
    core.Money money48 = core.Money.dollars(10.0d);
    java.lang.String str49 = money48.toString();
    java.math.BigDecimal bigDecimal50 = money48.amount();
    core.Money money51 = money46.add(money48);
    core.Money money52 = money44.subtract(money46);
    core.Money money54 = core.Money.dollars(10.0d);
    java.lang.String str55 = money54.toString();
    java.math.BigDecimal bigDecimal56 = money54.amount();
    core.Money[] money_array58 = money54.divide(1);
    boolean b60 = money54.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale61 = money54.getLocale();
    money46.setLocale(locale61);
    java.util.Locale locale63 = money46.getLocale();
    money29.setLocale(locale63);
    core.Money money65 = new core.Money(100.0d, currency18, locale63);
    core.Money money66 = null;
    // The following exception was thrown during execution in test generation
    try {
      core.Money money67 = money65.add(money66);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "$10.00"+ "'", str8.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "$10.00"+ "'", str16.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "$10.00"+ "'", str27.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "$10.00"+ "'", str30.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "$10.00"+ "'", str39.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "$10.00"+ "'", str49.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "$10.00"+ "'", str55.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale63);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }


    core.Money money1 = core.Money.dollars(10.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    java.lang.String str4 = money3.toString();
    java.math.BigDecimal bigDecimal5 = money3.amount();
    core.Money money6 = money1.add(money3);
    core.Money money8 = core.Money.dollars(10.0d);
    java.lang.String str9 = money8.toString();
    java.math.BigDecimal bigDecimal10 = money8.amount();
    core.Money[] money_array12 = money8.divide(10);
    core.Money money13 = money3.subtract(money8);
    core.Money money17 = core.Money.dollars(10.0d);
    java.lang.String str18 = money17.toString();
    core.Money money20 = core.Money.dollars(10.0d);
    java.lang.String str21 = money20.toString();
    java.math.BigDecimal bigDecimal22 = money20.amount();
    core.Money[] money_array24 = money20.divide(10);
    boolean b25 = money17.equals((java.lang.Object)money20);
    core.Money money27 = core.Money.dollars(10.0d);
    core.Money money29 = core.Money.dollars(10.0d);
    java.lang.String str30 = money29.toString();
    java.math.BigDecimal bigDecimal31 = money29.amount();
    core.Money money32 = money27.add(money29);
    core.Money money33 = money20.add(money32);
    core.Money money35 = core.Money.dollars(10.0d);
    core.Money money36 = money33.add(money35);
    java.util.Currency currency37 = money35.getCurrency();
    core.Money money38 = new core.Money((-1L), currency37);
    core.Money money39 = new core.Money(0L, currency37);
    core.Money money41 = core.Money.dollars(10.0d);
    java.lang.String str42 = money41.toString();
    java.math.BigDecimal bigDecimal43 = money41.amount();
    java.lang.String str44 = money41.toString();
    core.Money money46 = core.Money.dollars(10.0d);
    java.lang.String str47 = money46.toString();
    java.math.BigDecimal bigDecimal48 = money46.amount();
    java.util.Currency currency49 = money46.getCurrency();
    money41.setCurrency(currency49);
    core.Money money52 = core.Money.dollars(10.0d);
    java.lang.String str53 = money52.toString();
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    java.math.BigDecimal bigDecimal57 = money55.amount();
    core.Money[] money_array59 = money55.divide(10);
    boolean b60 = money52.equals((java.lang.Object)money55);
    core.Money money62 = core.Money.dollars(10.0d);
    core.Money money64 = core.Money.dollars(10.0d);
    java.lang.String str65 = money64.toString();
    java.math.BigDecimal bigDecimal66 = money64.amount();
    core.Money money67 = money62.add(money64);
    core.Money money68 = money55.add(money67);
    boolean b69 = money41.equals((java.lang.Object)money55);
    java.util.Locale locale70 = money55.getLocale();
    java.lang.String str71 = money55.toString();
    core.Money money73 = core.Money.dollars((-1.0d));
    java.util.Currency currency74 = money73.getCurrency();
    money55.setCurrency(currency74);
    boolean b76 = money39.equals((java.lang.Object)currency74);
    java.util.Locale locale77 = money39.getLocale();
    boolean b78 = money13.equals((java.lang.Object)money39);
    java.util.Currency currency79 = money13.getCurrency();
    java.util.Locale locale80 = money13.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "$10.00"+ "'", str4.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$10.00"+ "'", str9.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "$10.00"+ "'", str18.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "$10.00"+ "'", str21.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "$10.00"+ "'", str30.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "$10.00"+ "'", str42.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "$10.00"+ "'", str44.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "$10.00"+ "'", str47.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "$10.00"+ "'", str53.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "$10.00"+ "'", str56.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "$10.00"+ "'", str65.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "$10.00"+ "'", str71.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale80);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }


    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money[] money_array8 = money4.divide(1);
    boolean b10 = money4.equals((java.lang.Object)(-1.0d));
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    java.math.BigDecimal bigDecimal14 = money12.amount();
    java.util.Currency currency15 = money12.getCurrency();
    money4.setCurrency(currency15);
    core.Money money18 = core.Money.dollars(10.0d);
    core.Money money20 = core.Money.dollars(10.0d);
    core.Money money22 = core.Money.dollars(10.0d);
    java.lang.String str23 = money22.toString();
    java.math.BigDecimal bigDecimal24 = money22.amount();
    core.Money money25 = money20.add(money22);
    core.Money money26 = money18.subtract(money20);
    core.Money money28 = core.Money.dollars(10.0d);
    java.lang.String str29 = money28.toString();
    java.math.BigDecimal bigDecimal30 = money28.amount();
    core.Money[] money_array32 = money28.divide(1);
    boolean b34 = money28.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale35 = money28.getLocale();
    money20.setLocale(locale35);
    core.Money money37 = new core.Money(0.0d, currency15, locale35);
    core.Money money38 = new core.Money(1.0d, currency15);
    core.Money money39 = new core.Money(0.0d, currency15);
    core.Money money40 = new core.Money();
    core.Money money42 = core.Money.dollars(10.0d);
    core.Money money44 = core.Money.dollars(10.0d);
    java.lang.String str45 = money44.toString();
    java.math.BigDecimal bigDecimal46 = money44.amount();
    core.Money money47 = money42.add(money44);
    core.Money money48 = money40.add(money44);
    core.Money money50 = core.Money.dollars(10.0d);
    core.Money money52 = core.Money.dollars(10.0d);
    java.lang.String str53 = money52.toString();
    java.math.BigDecimal bigDecimal54 = money52.amount();
    core.Money money55 = money50.add(money52);
    core.Money money57 = core.Money.dollars(10.0d);
    java.lang.String str58 = money57.toString();
    java.math.BigDecimal bigDecimal59 = money57.amount();
    core.Money[] money_array61 = money57.divide(10);
    core.Money money62 = money52.subtract(money57);
    core.Money money63 = money44.add(money62);
    core.Money money65 = core.Money.dollars(10.0d);
    java.lang.String str66 = money65.toString();
    core.Money money68 = core.Money.dollars(10.0d);
    java.lang.String str69 = money68.toString();
    java.math.BigDecimal bigDecimal70 = money68.amount();
    core.Money[] money_array72 = money68.divide(10);
    boolean b73 = money65.equals((java.lang.Object)money68);
    core.Money money75 = core.Money.dollars(10.0d);
    core.Money money77 = core.Money.dollars(10.0d);
    java.lang.String str78 = money77.toString();
    java.math.BigDecimal bigDecimal79 = money77.amount();
    core.Money money80 = money75.add(money77);
    core.Money money81 = money68.add(money80);
    core.Money money83 = core.Money.dollars(10.0d);
    core.Money money84 = money81.add(money83);
    java.util.Currency currency85 = money84.getCurrency();
    money62.setCurrency(currency85);
    core.Money money87 = money39.subtract(money62);
    java.lang.String str88 = money87.toString();
    java.math.BigDecimal bigDecimal89 = money87.amount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "$10.00"+ "'", str23.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "$10.00"+ "'", str29.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "$10.00"+ "'", str45.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "$10.00"+ "'", str53.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "$10.00"+ "'", str58.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "$10.00"+ "'", str66.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "$10.00"+ "'", str69.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "$10.00"+ "'", str78.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "$0.00"+ "'", str88.equals("$0.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal89);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }


    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money[] money_array9 = money5.divide(1);
    boolean b11 = money5.equals((java.lang.Object)(-1.0d));
    core.Money money13 = core.Money.dollars(10.0d);
    java.lang.String str14 = money13.toString();
    java.math.BigDecimal bigDecimal15 = money13.amount();
    java.util.Currency currency16 = money13.getCurrency();
    money5.setCurrency(currency16);
    core.Money money19 = core.Money.dollars(10.0d);
    java.lang.String str20 = money19.toString();
    java.math.BigDecimal bigDecimal21 = money19.amount();
    core.Money[] money_array23 = money19.divide(1);
    boolean b25 = money19.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale26 = money19.getLocale();
    core.Money money27 = new core.Money(1.0d, currency16, locale26);
    core.Money money29 = core.Money.dollars(10.0d);
    core.Money money31 = core.Money.dollars(10.0d);
    java.lang.String str32 = money31.toString();
    java.math.BigDecimal bigDecimal33 = money31.amount();
    core.Money[] money_array35 = money31.divide(1);
    boolean b37 = money31.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale38 = money31.getLocale();
    money29.setLocale(locale38);
    core.Money money40 = new core.Money(1.0d, currency16, locale38);
    core.Money money41 = new core.Money(11.0d, currency16);
    core.Money money42 = new core.Money(0L, currency16);
    java.math.BigDecimal bigDecimal43 = money42.amount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "$10.00"+ "'", str20.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "$10.00"+ "'", str32.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal43);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.lang.String str2 = money1.toString();
    java.math.BigDecimal bigDecimal3 = money1.amount();
    java.util.Currency currency4 = money1.getCurrency();
    core.Money money9 = core.Money.dollars(10.0d);
    java.lang.String str10 = money9.toString();
    java.math.BigDecimal bigDecimal11 = money9.amount();
    core.Money[] money_array13 = money9.divide(1);
    boolean b15 = money9.equals((java.lang.Object)(-1.0d));
    core.Money money17 = core.Money.dollars(10.0d);
    java.lang.String str18 = money17.toString();
    java.math.BigDecimal bigDecimal19 = money17.amount();
    java.util.Currency currency20 = money17.getCurrency();
    money9.setCurrency(currency20);
    core.Money money22 = new core.Money(10.0d, currency20);
    core.Money money23 = new core.Money(1.0d, currency20);
    core.Money money24 = new core.Money(0L, currency20);
    core.Money money25 = money1.subtract(money24);
    money1.setAmount(0.0d);
    core.Money money32 = core.Money.dollars(10.0d);
    java.lang.String str33 = money32.toString();
    java.math.BigDecimal bigDecimal34 = money32.amount();
    core.Money[] money_array36 = money32.divide(1);
    boolean b38 = money32.equals((java.lang.Object)(-1.0d));
    core.Money money40 = core.Money.dollars(10.0d);
    java.lang.String str41 = money40.toString();
    java.math.BigDecimal bigDecimal42 = money40.amount();
    java.util.Currency currency43 = money40.getCurrency();
    money32.setCurrency(currency43);
    core.Money money46 = core.Money.dollars(10.0d);
    java.lang.String str47 = money46.toString();
    java.math.BigDecimal bigDecimal48 = money46.amount();
    core.Money[] money_array50 = money46.divide(1);
    boolean b52 = money46.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale53 = money46.getLocale();
    core.Money money54 = new core.Money(1.0d, currency43, locale53);
    core.Money money56 = core.Money.dollars(10.0d);
    core.Money money58 = core.Money.dollars(10.0d);
    java.lang.String str59 = money58.toString();
    java.math.BigDecimal bigDecimal60 = money58.amount();
    core.Money[] money_array62 = money58.divide(1);
    boolean b64 = money58.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale65 = money58.getLocale();
    money56.setLocale(locale65);
    core.Money money67 = new core.Money(1.0d, currency43, locale65);
    core.Money money68 = new core.Money((-1L), currency43);
    boolean b69 = money1.equals((java.lang.Object)(-1L));
    java.util.Locale locale70 = null;
    // The following exception was thrown during execution in test generation
    try {
      money1.setLocale(locale70);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "$10.00"+ "'", str2.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$10.00"+ "'", str10.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "$10.00"+ "'", str18.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "$10.00"+ "'", str33.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "$10.00"+ "'", str41.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "$10.00"+ "'", str47.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "$10.00"+ "'", str59.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }


    core.Money money2 = core.Money.dollars(10.0d);
    java.lang.String str3 = money2.toString();
    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money[] money_array9 = money5.divide(10);
    boolean b10 = money2.equals((java.lang.Object)money5);
    core.Money money12 = core.Money.dollars(10.0d);
    core.Money money14 = core.Money.dollars(10.0d);
    java.lang.String str15 = money14.toString();
    java.math.BigDecimal bigDecimal16 = money14.amount();
    core.Money money17 = money12.add(money14);
    core.Money money18 = money5.add(money17);
    core.Money money20 = core.Money.dollars(10.0d);
    java.lang.String str21 = money20.toString();
    java.lang.String str22 = money20.toString();
    money20.setAmount(0.0d);
    core.Money money25 = money18.subtract(money20);
    core.Money money28 = core.Money.dollars(10.0d);
    java.lang.String str29 = money28.toString();
    java.math.BigDecimal bigDecimal30 = money28.amount();
    core.Money[] money_array32 = money28.divide(1);
    boolean b34 = money28.equals((java.lang.Object)(-1.0d));
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    java.math.BigDecimal bigDecimal38 = money36.amount();
    java.util.Currency currency39 = money36.getCurrency();
    money28.setCurrency(currency39);
    core.Money money41 = new core.Money(100.0d, currency39);
    java.util.Currency currency42 = money41.getCurrency();
    core.Money money44 = core.Money.dollars(10.0d);
    core.Money money46 = core.Money.dollars(10.0d);
    java.lang.String str47 = money46.toString();
    java.math.BigDecimal bigDecimal48 = money46.amount();
    core.Money money49 = money44.add(money46);
    core.Money money51 = core.Money.dollars(10.0d);
    java.lang.String str52 = money51.toString();
    java.math.BigDecimal bigDecimal53 = money51.amount();
    core.Money[] money_array55 = money51.divide(10);
    core.Money money56 = money46.subtract(money51);
    core.Money money57 = money41.add(money56);
    core.Money money58 = money25.subtract(money57);
    core.Money money60 = core.Money.dollars(10.0d);
    java.lang.String str61 = money60.toString();
    java.math.BigDecimal bigDecimal62 = money60.amount();
    core.Money[] money_array64 = money60.divide(1);
    boolean b66 = money60.equals((java.lang.Object)(-1.0d));
    core.Money money68 = core.Money.dollars(10.0d);
    java.lang.String str69 = money68.toString();
    java.math.BigDecimal bigDecimal70 = money68.amount();
    java.util.Currency currency71 = money68.getCurrency();
    money60.setCurrency(currency71);
    java.lang.String str73 = money60.toString();
    money60.setAmount(0.0d);
    java.lang.String str76 = money60.toString();
    core.Money money77 = money57.add(money60);
    core.Money money79 = core.Money.dollars((-1.0d));
    java.util.Currency currency80 = money79.getCurrency();
    money60.setCurrency(currency80);
    core.Money money83 = core.Money.dollars(10.0d);
    core.Money money85 = core.Money.dollars(10.0d);
    java.lang.String str86 = money85.toString();
    java.math.BigDecimal bigDecimal87 = money85.amount();
    core.Money money88 = money83.add(money85);
    core.Money money90 = core.Money.dollars(10.0d);
    java.lang.String str91 = money90.toString();
    java.math.BigDecimal bigDecimal92 = money90.amount();
    core.Money[] money_array94 = money90.divide(10);
    core.Money money95 = money85.subtract(money90);
    java.util.Locale locale96 = money90.getLocale();
    java.util.Locale locale97 = money90.getLocale();
    core.Money money98 = new core.Money(90.0d, currency80, locale97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "$10.00"+ "'", str3.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$10.00"+ "'", str15.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "$10.00"+ "'", str21.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "$10.00"+ "'", str22.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "$10.00"+ "'", str29.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "$10.00"+ "'", str37.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "$10.00"+ "'", str47.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "$10.00"+ "'", str52.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "$10.00"+ "'", str61.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "$10.00"+ "'", str69.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "$10.00"+ "'", str73.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "$0.00"+ "'", str76.equals("$0.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "$10.00"+ "'", str86.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "$10.00"+ "'", str91.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale97);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }


    core.Money money1 = core.Money.dollars(10.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    java.lang.String str4 = money3.toString();
    java.math.BigDecimal bigDecimal5 = money3.amount();
    core.Money money6 = money1.add(money3);
    core.Money money8 = core.Money.dollars(10.0d);
    java.lang.String str9 = money8.toString();
    java.math.BigDecimal bigDecimal10 = money8.amount();
    core.Money[] money_array12 = money8.divide(10);
    core.Money money13 = money3.subtract(money8);
    core.Money[] money_array15 = money3.divide(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "$10.00"+ "'", str4.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$10.00"+ "'", str9.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array15);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }


    core.Money money2 = core.Money.dollars(10.0d);
    java.lang.String str3 = money2.toString();
    java.math.BigDecimal bigDecimal4 = money2.amount();
    java.lang.String str5 = money2.toString();
    core.Money money7 = core.Money.dollars(10.0d);
    java.lang.String str8 = money7.toString();
    java.math.BigDecimal bigDecimal9 = money7.amount();
    java.util.Currency currency10 = money7.getCurrency();
    money2.setCurrency(currency10);
    core.Money money12 = new core.Money(100L, currency10);
    core.Money money15 = core.Money.dollars(10.0d);
    java.lang.String str16 = money15.toString();
    java.math.BigDecimal bigDecimal17 = money15.amount();
    core.Money[] money_array19 = money15.divide(10);
    money15.setAmount(1.0d);
    java.lang.String str22 = money15.toString();
    core.Money money25 = core.Money.dollars(10.0d);
    java.lang.String str26 = money25.toString();
    java.math.BigDecimal bigDecimal27 = money25.amount();
    core.Money[] money_array29 = money25.divide(1);
    boolean b31 = money25.equals((java.lang.Object)(-1.0d));
    core.Money money33 = core.Money.dollars(10.0d);
    java.lang.String str34 = money33.toString();
    java.math.BigDecimal bigDecimal35 = money33.amount();
    java.util.Currency currency36 = money33.getCurrency();
    money25.setCurrency(currency36);
    core.Money money39 = core.Money.dollars(10.0d);
    java.lang.String str40 = money39.toString();
    java.math.BigDecimal bigDecimal41 = money39.amount();
    core.Money[] money_array43 = money39.divide(1);
    boolean b45 = money39.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale46 = money39.getLocale();
    core.Money money47 = new core.Money(1.0d, currency36, locale46);
    money15.setCurrency(currency36);
    core.Money money50 = core.Money.dollars(10.0d);
    core.Money money52 = core.Money.dollars(10.0d);
    core.Money money54 = core.Money.dollars(10.0d);
    java.lang.String str55 = money54.toString();
    java.math.BigDecimal bigDecimal56 = money54.amount();
    core.Money money57 = money52.add(money54);
    core.Money money58 = money50.subtract(money52);
    core.Money money60 = core.Money.dollars(10.0d);
    java.lang.String str61 = money60.toString();
    java.math.BigDecimal bigDecimal62 = money60.amount();
    core.Money[] money_array64 = money60.divide(1);
    boolean b66 = money60.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale67 = money60.getLocale();
    money52.setLocale(locale67);
    core.Money money69 = new core.Money(1.0d, currency36, locale67);
    money12.setLocale(locale67);
    core.Money money72 = core.Money.dollars(10.0d);
    java.lang.String str73 = money72.toString();
    java.math.BigDecimal bigDecimal74 = money72.amount();
    core.Money[] money_array76 = money72.divide(1);
    boolean b78 = money72.equals((java.lang.Object)(-1.0d));
    core.Money money80 = core.Money.dollars(10.0d);
    java.lang.String str81 = money80.toString();
    java.math.BigDecimal bigDecimal82 = money80.amount();
    java.util.Currency currency83 = money80.getCurrency();
    money72.setCurrency(currency83);
    core.Money money85 = money12.subtract(money72);
    core.Money money86 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b87 = money72.equals(money86);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "$10.00"+ "'", str3.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "$10.00"+ "'", str8.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "$10.00"+ "'", str16.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "$1.00"+ "'", str22.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "$10.00"+ "'", str26.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "$10.00"+ "'", str34.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "$10.00"+ "'", str40.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "$10.00"+ "'", str55.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "$10.00"+ "'", str61.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "$10.00"+ "'", str73.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "$10.00"+ "'", str81.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money85);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }


    core.Money money2 = core.Money.dollars(10.0d);
    java.lang.String str3 = money2.toString();
    java.math.BigDecimal bigDecimal4 = money2.amount();
    core.Money[] money_array6 = money2.divide(1);
    boolean b8 = money2.equals((java.lang.Object)(-1.0d));
    core.Money money10 = core.Money.dollars(10.0d);
    java.lang.String str11 = money10.toString();
    java.math.BigDecimal bigDecimal12 = money10.amount();
    java.util.Currency currency13 = money10.getCurrency();
    money2.setCurrency(currency13);
    java.lang.String str15 = money2.toString();
    core.Money money17 = core.Money.dollars(10.0d);
    core.Money money19 = core.Money.dollars(10.0d);
    core.Money money21 = core.Money.dollars(10.0d);
    java.lang.String str22 = money21.toString();
    java.math.BigDecimal bigDecimal23 = money21.amount();
    core.Money money24 = money19.add(money21);
    core.Money money25 = money17.subtract(money19);
    java.lang.String str26 = money19.toString();
    core.Money money28 = core.Money.dollars(10.0d);
    core.Money money30 = core.Money.dollars(10.0d);
    core.Money money32 = core.Money.dollars(10.0d);
    java.lang.String str33 = money32.toString();
    java.math.BigDecimal bigDecimal34 = money32.amount();
    core.Money money35 = money30.add(money32);
    core.Money money36 = money28.subtract(money30);
    core.Money money37 = money19.add(money36);
    core.Money money39 = core.Money.dollars(10.0d);
    java.lang.String str40 = money39.toString();
    java.math.BigDecimal bigDecimal41 = money39.amount();
    java.util.Currency currency42 = money39.getCurrency();
    boolean b43 = money36.equals(money39);
    java.util.Currency currency44 = money36.getCurrency();
    money2.setCurrency(currency44);
    core.Money money48 = core.Money.dollars(10.0d);
    java.lang.String str49 = money48.toString();
    java.math.BigDecimal bigDecimal50 = money48.amount();
    java.util.Currency currency51 = money48.getCurrency();
    core.Money money52 = new core.Money(1.0d, currency51);
    boolean b53 = money2.equals((java.lang.Object)currency51);
    core.Money money54 = new core.Money(10L, currency51);
    core.Money money60 = core.Money.dollars(10.0d);
    java.lang.String str61 = money60.toString();
    java.math.BigDecimal bigDecimal62 = money60.amount();
    core.Money[] money_array64 = money60.divide(1);
    boolean b66 = money60.equals((java.lang.Object)(-1.0d));
    core.Money money68 = core.Money.dollars(10.0d);
    java.lang.String str69 = money68.toString();
    java.math.BigDecimal bigDecimal70 = money68.amount();
    java.util.Currency currency71 = money68.getCurrency();
    money60.setCurrency(currency71);
    core.Money money74 = core.Money.dollars(10.0d);
    core.Money money76 = core.Money.dollars(10.0d);
    core.Money money78 = core.Money.dollars(10.0d);
    java.lang.String str79 = money78.toString();
    java.math.BigDecimal bigDecimal80 = money78.amount();
    core.Money money81 = money76.add(money78);
    core.Money money82 = money74.subtract(money76);
    core.Money money84 = core.Money.dollars(10.0d);
    java.lang.String str85 = money84.toString();
    java.math.BigDecimal bigDecimal86 = money84.amount();
    core.Money[] money_array88 = money84.divide(1);
    boolean b90 = money84.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale91 = money84.getLocale();
    money76.setLocale(locale91);
    core.Money money93 = new core.Money(0.0d, currency71, locale91);
    core.Money money94 = new core.Money(1.0d, currency71);
    core.Money money95 = new core.Money(0.0d, currency71);
    core.Money money96 = new core.Money(0.0d, currency71);
    core.Money money97 = money54.add(money96);
    java.math.BigDecimal bigDecimal98 = money97.amount();
    java.util.Locale locale99 = money97.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "$10.00"+ "'", str3.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "$10.00"+ "'", str11.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$10.00"+ "'", str15.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "$10.00"+ "'", str22.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "$10.00"+ "'", str26.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "$10.00"+ "'", str33.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "$10.00"+ "'", str40.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "$10.00"+ "'", str49.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "$10.00"+ "'", str61.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "$10.00"+ "'", str69.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "$10.00"+ "'", str79.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "$10.00"+ "'", str85.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale99);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test11"); }


    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money[] money_array9 = money5.divide(1);
    boolean b11 = money5.equals((java.lang.Object)(-1.0d));
    core.Money money13 = core.Money.dollars(10.0d);
    java.lang.String str14 = money13.toString();
    java.math.BigDecimal bigDecimal15 = money13.amount();
    java.util.Currency currency16 = money13.getCurrency();
    money5.setCurrency(currency16);
    core.Money money18 = new core.Money(0.0d, currency16);
    core.Money money19 = new core.Money(0.0d, currency16);
    core.Money money25 = core.Money.dollars(10.0d);
    java.lang.String str26 = money25.toString();
    java.math.BigDecimal bigDecimal27 = money25.amount();
    core.Money[] money_array29 = money25.divide(1);
    boolean b31 = money25.equals((java.lang.Object)(-1.0d));
    core.Money money33 = core.Money.dollars(10.0d);
    java.lang.String str34 = money33.toString();
    java.math.BigDecimal bigDecimal35 = money33.amount();
    java.util.Currency currency36 = money33.getCurrency();
    money25.setCurrency(currency36);
    core.Money money38 = new core.Money(10.0d, currency36);
    core.Money money39 = new core.Money(1.0d, currency36);
    core.Money money40 = new core.Money(0L, currency36);
    core.Money money44 = core.Money.dollars(10.0d);
    java.lang.String str45 = money44.toString();
    java.math.BigDecimal bigDecimal46 = money44.amount();
    core.Money[] money_array48 = money44.divide(1);
    boolean b50 = money44.equals((java.lang.Object)(-1.0d));
    core.Money money52 = core.Money.dollars(10.0d);
    java.lang.String str53 = money52.toString();
    java.math.BigDecimal bigDecimal54 = money52.amount();
    java.util.Currency currency55 = money52.getCurrency();
    money44.setCurrency(currency55);
    core.Money money58 = core.Money.dollars(10.0d);
    java.lang.String str59 = money58.toString();
    java.math.BigDecimal bigDecimal60 = money58.amount();
    core.Money[] money_array62 = money58.divide(1);
    boolean b64 = money58.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale65 = money58.getLocale();
    core.Money money66 = new core.Money(1.0d, currency55, locale65);
    core.Money money68 = core.Money.dollars(10.0d);
    core.Money money70 = core.Money.dollars(10.0d);
    java.lang.String str71 = money70.toString();
    java.math.BigDecimal bigDecimal72 = money70.amount();
    core.Money[] money_array74 = money70.divide(1);
    boolean b76 = money70.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale77 = money70.getLocale();
    money68.setLocale(locale77);
    core.Money money79 = new core.Money(1.0d, currency55, locale77);
    core.Money money80 = new core.Money(0.0d, currency36, locale77);
    java.util.Locale locale81 = money80.getLocale();
    core.Money money82 = money19.add(money80);
    java.util.Currency currency83 = money80.getCurrency();
    core.Money money84 = new core.Money(100L, currency83);
    core.Money money85 = new core.Money(10L, currency83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "$10.00"+ "'", str26.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "$10.00"+ "'", str34.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "$10.00"+ "'", str45.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "$10.00"+ "'", str53.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "$10.00"+ "'", str59.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "$10.00"+ "'", str71.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency83);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test12"); }


    core.Money money7 = core.Money.dollars(10.0d);
    java.lang.String str8 = money7.toString();
    java.math.BigDecimal bigDecimal9 = money7.amount();
    java.lang.String str10 = money7.toString();
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    java.math.BigDecimal bigDecimal14 = money12.amount();
    java.util.Currency currency15 = money12.getCurrency();
    money7.setCurrency(currency15);
    core.Money money18 = core.Money.dollars(10.0d);
    core.Money money20 = core.Money.dollars(10.0d);
    core.Money money22 = core.Money.dollars(10.0d);
    java.lang.String str23 = money22.toString();
    java.math.BigDecimal bigDecimal24 = money22.amount();
    core.Money money25 = money20.add(money22);
    core.Money money26 = money18.subtract(money20);
    core.Money money28 = core.Money.dollars(10.0d);
    java.lang.String str29 = money28.toString();
    java.math.BigDecimal bigDecimal30 = money28.amount();
    core.Money[] money_array32 = money28.divide(1);
    boolean b34 = money28.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale35 = money28.getLocale();
    money20.setLocale(locale35);
    core.Money money37 = new core.Money(100.0d, currency15, locale35);
    core.Money money38 = new core.Money(10.0d, currency15);
    core.Money money39 = new core.Money(100L, currency15);
    core.Money money40 = new core.Money((-1L), currency15);
    core.Money money41 = new core.Money(1.0d, currency15);
    core.Money money47 = core.Money.dollars(10.0d);
    java.lang.String str48 = money47.toString();
    java.math.BigDecimal bigDecimal49 = money47.amount();
    core.Money[] money_array51 = money47.divide(1);
    boolean b53 = money47.equals((java.lang.Object)(-1.0d));
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    java.math.BigDecimal bigDecimal57 = money55.amount();
    java.util.Currency currency58 = money55.getCurrency();
    money47.setCurrency(currency58);
    core.Money money60 = new core.Money(10.0d, currency58);
    core.Money money61 = new core.Money(1.0d, currency58);
    core.Money money62 = new core.Money(10.0d, currency58);
    core.Money money64 = core.Money.dollars(10.0d);
    core.Money money66 = core.Money.dollars(10.0d);
    core.Money money68 = core.Money.dollars(10.0d);
    java.lang.String str69 = money68.toString();
    java.math.BigDecimal bigDecimal70 = money68.amount();
    core.Money money71 = money66.add(money68);
    core.Money money72 = money64.subtract(money66);
    core.Money money74 = core.Money.dollars(10.0d);
    java.lang.String str75 = money74.toString();
    java.math.BigDecimal bigDecimal76 = money74.amount();
    core.Money[] money_array78 = money74.divide(1);
    boolean b80 = money74.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale81 = money74.getLocale();
    money66.setLocale(locale81);
    core.Money money84 = core.Money.dollars(10.0d);
    core.Money money86 = core.Money.dollars(10.0d);
    core.Money money88 = core.Money.dollars(10.0d);
    java.lang.String str89 = money88.toString();
    java.math.BigDecimal bigDecimal90 = money88.amount();
    core.Money money91 = money86.add(money88);
    core.Money money92 = money84.subtract(money86);
    java.math.BigDecimal bigDecimal93 = money84.amount();
    boolean b94 = money66.equals(money84);
    java.util.Locale locale95 = money66.getLocale();
    core.Money money96 = new core.Money((-1.0d), currency58, locale95);
    core.Money money97 = new core.Money(10.0d, currency15, locale95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "$10.00"+ "'", str8.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$10.00"+ "'", str10.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "$10.00"+ "'", str23.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "$10.00"+ "'", str29.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "$10.00"+ "'", str48.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "$10.00"+ "'", str56.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "$10.00"+ "'", str69.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "$10.00"+ "'", str75.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + "$10.00"+ "'", str89.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale95);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test13"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.lang.String str2 = money1.toString();
    java.math.BigDecimal bigDecimal3 = money1.amount();
    core.Money[] money_array5 = money1.divide(1);
    boolean b7 = money1.equals((java.lang.Object)(-1.0d));
    core.Money money9 = core.Money.dollars(10.0d);
    java.lang.String str10 = money9.toString();
    java.math.BigDecimal bigDecimal11 = money9.amount();
    java.util.Currency currency12 = money9.getCurrency();
    money1.setCurrency(currency12);
    java.lang.String str14 = money1.toString();
    money1.setAmount(0.0d);
    core.Money money18 = core.Money.dollars(10.0d);
    core.Money[] money_array20 = money18.divide(10);
    java.util.Locale locale21 = money18.getLocale();
    core.Money money22 = money1.subtract(money18);
    core.Money money24 = core.Money.dollars(10.0d);
    core.Money money26 = core.Money.dollars(10.0d);
    core.Money money28 = core.Money.dollars(10.0d);
    java.lang.String str29 = money28.toString();
    java.math.BigDecimal bigDecimal30 = money28.amount();
    core.Money money31 = money26.add(money28);
    core.Money money32 = money24.subtract(money26);
    java.lang.String str33 = money26.toString();
    core.Money money35 = core.Money.dollars(10.0d);
    core.Money money37 = core.Money.dollars(10.0d);
    core.Money money39 = core.Money.dollars(10.0d);
    java.lang.String str40 = money39.toString();
    java.math.BigDecimal bigDecimal41 = money39.amount();
    core.Money money42 = money37.add(money39);
    core.Money money43 = money35.subtract(money37);
    core.Money money44 = money26.add(money43);
    core.Money money46 = core.Money.dollars(10.0d);
    java.lang.String str47 = money46.toString();
    java.math.BigDecimal bigDecimal48 = money46.amount();
    java.util.Currency currency49 = money46.getCurrency();
    boolean b50 = money43.equals(money46);
    java.util.Currency currency51 = money43.getCurrency();
    core.Money money52 = money22.subtract(money43);
    java.lang.String str53 = money52.toString();
    java.util.Currency currency54 = money52.getCurrency();
    java.math.BigDecimal bigDecimal55 = money52.amount();
    core.Money money57 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal58 = money57.amount();
    core.Money money60 = core.Money.dollars(10.0d);
    java.lang.String str61 = money60.toString();
    core.Money money63 = core.Money.dollars(10.0d);
    java.lang.String str64 = money63.toString();
    java.math.BigDecimal bigDecimal65 = money63.amount();
    core.Money[] money_array67 = money63.divide(10);
    boolean b68 = money60.equals((java.lang.Object)money63);
    money63.setAmount(100.0d);
    boolean b71 = money57.equals(money63);
    money63.setAmount(10.0d);
    core.Money money75 = core.Money.dollars(10.0d);
    core.Money money77 = core.Money.dollars(10.0d);
    core.Money money79 = core.Money.dollars(10.0d);
    java.lang.String str80 = money79.toString();
    java.math.BigDecimal bigDecimal81 = money79.amount();
    core.Money money82 = money77.add(money79);
    core.Money money83 = money75.subtract(money77);
    core.Money money85 = core.Money.dollars(10.0d);
    boolean b86 = money83.equals(money85);
    boolean b87 = money63.equals((java.lang.Object)b86);
    java.util.Currency currency88 = money63.getCurrency();
    core.Money money89 = money52.subtract(money63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "$10.00"+ "'", str2.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$10.00"+ "'", str10.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "$10.00"+ "'", str29.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "$10.00"+ "'", str33.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "$10.00"+ "'", str40.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "$10.00"+ "'", str47.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "($10.00)"+ "'", str53.equals("($10.00)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "$10.00"+ "'", str61.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "$10.00"+ "'", str64.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "$10.00"+ "'", str80.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money89);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test14"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.lang.String str2 = money1.toString();
    java.math.BigDecimal bigDecimal3 = money1.amount();
    core.Money[] money_array5 = money1.divide(1);
    boolean b7 = money1.equals((java.lang.Object)(-1.0d));
    core.Money money9 = core.Money.dollars(10.0d);
    java.lang.String str10 = money9.toString();
    java.math.BigDecimal bigDecimal11 = money9.amount();
    java.util.Currency currency12 = money9.getCurrency();
    money1.setCurrency(currency12);
    core.Money money15 = core.Money.dollars(10.0d);
    java.lang.String str16 = money15.toString();
    java.math.BigDecimal bigDecimal17 = money15.amount();
    core.Money[] money_array19 = money15.divide(1);
    boolean b21 = money15.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale22 = money15.getLocale();
    core.Money money24 = core.Money.dollars(10.0d);
    core.Money money26 = core.Money.dollars(10.0d);
    java.lang.String str27 = money26.toString();
    java.math.BigDecimal bigDecimal28 = money26.amount();
    core.Money money29 = money24.add(money26);
    core.Money money30 = money15.subtract(money24);
    core.Money money31 = money1.add(money30);
    java.util.Locale locale32 = money31.getLocale();
    core.Money money35 = core.Money.dollars(10.0d);
    java.lang.String str36 = money35.toString();
    java.math.BigDecimal bigDecimal37 = money35.amount();
    core.Money[] money_array39 = money35.divide(1);
    boolean b41 = money35.equals((java.lang.Object)(-1.0d));
    core.Money money43 = core.Money.dollars(10.0d);
    java.lang.String str44 = money43.toString();
    java.math.BigDecimal bigDecimal45 = money43.amount();
    java.util.Currency currency46 = money43.getCurrency();
    money35.setCurrency(currency46);
    core.Money money48 = new core.Money(10.0d, currency46);
    money31.setCurrency(currency46);
    core.Money money50 = null;
    // The following exception was thrown during execution in test generation
    try {
      core.Money money51 = money31.add(money50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "$10.00"+ "'", str2.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$10.00"+ "'", str10.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "$10.00"+ "'", str16.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "$10.00"+ "'", str27.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "$10.00"+ "'", str36.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "$10.00"+ "'", str44.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency46);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test15"); }


    core.Money money3 = core.Money.dollars(10.0d);
    java.lang.String str4 = money3.toString();
    java.math.BigDecimal bigDecimal5 = money3.amount();
    core.Money[] money_array7 = money3.divide(1);
    boolean b9 = money3.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale10 = money3.getLocale();
    core.Money money12 = core.Money.dollars(10.0d);
    core.Money money14 = core.Money.dollars(10.0d);
    java.lang.String str15 = money14.toString();
    java.math.BigDecimal bigDecimal16 = money14.amount();
    core.Money money17 = money12.add(money14);
    core.Money money18 = money3.subtract(money12);
    core.Money money20 = core.Money.dollars(10.0d);
    java.lang.String str21 = money20.toString();
    java.math.BigDecimal bigDecimal22 = money20.amount();
    java.lang.String str23 = money20.toString();
    core.Money money25 = core.Money.dollars(10.0d);
    java.lang.String str26 = money25.toString();
    java.math.BigDecimal bigDecimal27 = money25.amount();
    java.util.Currency currency28 = money25.getCurrency();
    money20.setCurrency(currency28);
    money12.setCurrency(currency28);
    core.Money money31 = new core.Money(10L, currency28);
    core.Money money32 = new core.Money();
    core.Money money34 = core.Money.dollars(10.0d);
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    java.math.BigDecimal bigDecimal38 = money36.amount();
    core.Money money39 = money34.add(money36);
    core.Money money40 = money32.add(money36);
    core.Money money42 = core.Money.dollars(10.0d);
    core.Money money44 = core.Money.dollars(10.0d);
    core.Money money46 = core.Money.dollars(10.0d);
    java.lang.String str47 = money46.toString();
    java.math.BigDecimal bigDecimal48 = money46.amount();
    core.Money money49 = money44.add(money46);
    core.Money money50 = money42.subtract(money44);
    java.lang.String str51 = money44.toString();
    core.Money money53 = core.Money.dollars(10.0d);
    core.Money money55 = core.Money.dollars(10.0d);
    core.Money money57 = core.Money.dollars(10.0d);
    java.lang.String str58 = money57.toString();
    java.math.BigDecimal bigDecimal59 = money57.amount();
    core.Money money60 = money55.add(money57);
    core.Money money61 = money53.subtract(money55);
    core.Money money62 = money44.add(money61);
    boolean b63 = money32.equals((java.lang.Object)money44);
    core.Money money64 = money31.add(money32);
    java.util.Locale locale65 = money31.getLocale();
    core.Money money66 = new core.Money();
    core.Money money68 = core.Money.dollars(10.0d);
    core.Money money70 = core.Money.dollars(10.0d);
    java.lang.String str71 = money70.toString();
    java.math.BigDecimal bigDecimal72 = money70.amount();
    core.Money money73 = money68.add(money70);
    core.Money money74 = money66.add(money70);
    java.math.BigDecimal bigDecimal75 = money74.amount();
    core.Money money76 = money31.add(money74);
    java.util.Currency currency77 = money31.getCurrency();
    core.Money money78 = new core.Money(9.0d, currency77);
    money78.setAmount(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "$10.00"+ "'", str4.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$10.00"+ "'", str15.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "$10.00"+ "'", str21.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "$10.00"+ "'", str23.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "$10.00"+ "'", str26.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "$10.00"+ "'", str37.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "$10.00"+ "'", str47.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "$10.00"+ "'", str51.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "$10.00"+ "'", str58.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "$10.00"+ "'", str71.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency77);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test16"); }


    core.Money money0 = new core.Money();
    core.Money money2 = core.Money.dollars(10.0d);
    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money money7 = money2.add(money4);
    core.Money money8 = money0.add(money4);
    core.Money money10 = core.Money.dollars(10.0d);
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    java.math.BigDecimal bigDecimal14 = money12.amount();
    core.Money money15 = money10.add(money12);
    core.Money money17 = core.Money.dollars(10.0d);
    java.lang.String str18 = money17.toString();
    java.math.BigDecimal bigDecimal19 = money17.amount();
    core.Money[] money_array21 = money17.divide(10);
    core.Money money22 = money12.subtract(money17);
    core.Money money23 = money4.add(money22);
    core.Money money25 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal26 = money25.amount();
    money25.setAmount((-1.0d));
    core.Money money29 = money23.add(money25);
    java.util.Currency currency30 = money23.getCurrency();
    money23.setAmount(9.0d);
    java.lang.Object obj33 = null;
    boolean b34 = money23.equals(obj33);
    java.lang.String str35 = money23.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "$10.00"+ "'", str18.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "$9.00"+ "'", str35.equals("$9.00"));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test17"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.lang.String str2 = money1.toString();
    java.math.BigDecimal bigDecimal3 = money1.amount();
    core.Money[] money_array5 = money1.divide(1);
    boolean b7 = money1.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale8 = money1.getLocale();
    core.Money money10 = core.Money.dollars(10.0d);
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    java.math.BigDecimal bigDecimal14 = money12.amount();
    core.Money money15 = money10.add(money12);
    core.Money money16 = money1.subtract(money10);
    core.Money money18 = core.Money.dollars(10.0d);
    java.lang.String str19 = money18.toString();
    java.math.BigDecimal bigDecimal20 = money18.amount();
    java.lang.String str21 = money18.toString();
    core.Money money23 = core.Money.dollars(10.0d);
    java.lang.String str24 = money23.toString();
    java.math.BigDecimal bigDecimal25 = money23.amount();
    java.util.Currency currency26 = money23.getCurrency();
    money18.setCurrency(currency26);
    money10.setCurrency(currency26);
    core.Money money34 = core.Money.dollars(10.0d);
    java.lang.String str35 = money34.toString();
    java.math.BigDecimal bigDecimal36 = money34.amount();
    core.Money[] money_array38 = money34.divide(1);
    boolean b40 = money34.equals((java.lang.Object)(-1.0d));
    core.Money money42 = core.Money.dollars(10.0d);
    java.lang.String str43 = money42.toString();
    java.math.BigDecimal bigDecimal44 = money42.amount();
    java.util.Currency currency45 = money42.getCurrency();
    money34.setCurrency(currency45);
    core.Money money47 = new core.Money(10.0d, currency45);
    core.Money money48 = new core.Money(1.0d, currency45);
    core.Money money49 = new core.Money(1L, currency45);
    core.Money money50 = new core.Money(10.0d, currency45);
    boolean b51 = money10.equals((java.lang.Object)10.0d);
    core.Money money53 = core.Money.dollars(10.0d);
    java.lang.String str54 = money53.toString();
    java.math.BigDecimal bigDecimal55 = money53.amount();
    core.Money[] money_array57 = money53.divide(1);
    boolean b59 = money53.equals((java.lang.Object)(-1.0d));
    core.Money money60 = money10.subtract(money53);
    java.math.BigDecimal bigDecimal61 = money60.amount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "$10.00"+ "'", str2.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "$10.00"+ "'", str19.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "$10.00"+ "'", str21.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "$10.00"+ "'", str24.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "$10.00"+ "'", str35.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "$10.00"+ "'", str43.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "$10.00"+ "'", str54.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal61);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test18"); }


    core.Money money1 = core.Money.dollars(10.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    java.lang.String str4 = money3.toString();
    java.math.BigDecimal bigDecimal5 = money3.amount();
    core.Money money6 = money1.add(money3);
    core.Money money8 = core.Money.dollars(10.0d);
    java.lang.String str9 = money8.toString();
    java.math.BigDecimal bigDecimal10 = money8.amount();
    core.Money[] money_array12 = money8.divide(10);
    core.Money money13 = money3.subtract(money8);
    java.util.Locale locale14 = money8.getLocale();
    java.lang.String str15 = money8.toString();
    core.Money money17 = core.Money.dollars(0.0d);
    core.Money money18 = money8.subtract(money17);
    core.Money money19 = new core.Money();
    core.Money money21 = core.Money.dollars(10.0d);
    core.Money money23 = core.Money.dollars(10.0d);
    java.lang.String str24 = money23.toString();
    java.math.BigDecimal bigDecimal25 = money23.amount();
    core.Money money26 = money21.add(money23);
    core.Money money27 = money19.add(money23);
    core.Money money29 = core.Money.dollars(10.0d);
    core.Money money31 = core.Money.dollars(10.0d);
    java.lang.String str32 = money31.toString();
    java.math.BigDecimal bigDecimal33 = money31.amount();
    core.Money money34 = money29.add(money31);
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    java.math.BigDecimal bigDecimal38 = money36.amount();
    core.Money[] money_array40 = money36.divide(10);
    core.Money money41 = money31.subtract(money36);
    core.Money money42 = money23.add(money41);
    core.Money money44 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal45 = money44.amount();
    money44.setAmount((-1.0d));
    core.Money money48 = money42.add(money44);
    core.Money money50 = core.Money.dollars(10.0d);
    java.lang.String str51 = money50.toString();
    java.math.BigDecimal bigDecimal52 = money50.amount();
    core.Money[] money_array54 = money50.divide(10);
    money50.setAmount(1.0d);
    java.lang.String str57 = money50.toString();
    java.util.Locale locale58 = money50.getLocale();
    core.Money money59 = money48.add(money50);
    core.Money money61 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal62 = money61.amount();
    core.Money[] money_array64 = money61.divide(100);
    core.Money money65 = money59.subtract(money61);
    core.Money money66 = money8.subtract(money59);
    java.util.Currency currency67 = money8.getCurrency();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "$10.00"+ "'", str4.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$10.00"+ "'", str9.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$10.00"+ "'", str15.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "$10.00"+ "'", str24.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "$10.00"+ "'", str32.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "$10.00"+ "'", str37.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "$10.00"+ "'", str51.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "$1.00"+ "'", str57.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency67);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test19"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.lang.String str2 = money1.toString();
    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money[] money_array8 = money4.divide(10);
    boolean b9 = money1.equals((java.lang.Object)money4);
    core.Money money11 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal12 = money11.amount();
    money11.setAmount((-1.0d));
    boolean b15 = money1.equals(money11);
    java.math.BigDecimal bigDecimal16 = money1.amount();
    core.Money money18 = core.Money.dollars(1.0d);
    core.Money money22 = core.Money.dollars(10.0d);
    java.lang.String str23 = money22.toString();
    java.math.BigDecimal bigDecimal24 = money22.amount();
    java.lang.String str25 = money22.toString();
    core.Money money27 = core.Money.dollars(10.0d);
    java.lang.String str28 = money27.toString();
    java.math.BigDecimal bigDecimal29 = money27.amount();
    java.util.Currency currency30 = money27.getCurrency();
    money22.setCurrency(currency30);
    core.Money money33 = core.Money.dollars(10.0d);
    core.Money money35 = core.Money.dollars(10.0d);
    core.Money money37 = core.Money.dollars(10.0d);
    java.lang.String str38 = money37.toString();
    java.math.BigDecimal bigDecimal39 = money37.amount();
    core.Money money40 = money35.add(money37);
    core.Money money41 = money33.subtract(money35);
    core.Money money43 = core.Money.dollars(10.0d);
    java.lang.String str44 = money43.toString();
    java.math.BigDecimal bigDecimal45 = money43.amount();
    core.Money[] money_array47 = money43.divide(1);
    boolean b49 = money43.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale50 = money43.getLocale();
    money35.setLocale(locale50);
    core.Money money52 = new core.Money(100.0d, currency30, locale50);
    core.Money money53 = new core.Money(100L, currency30);
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    core.Money money58 = core.Money.dollars(10.0d);
    java.lang.String str59 = money58.toString();
    java.math.BigDecimal bigDecimal60 = money58.amount();
    core.Money[] money_array62 = money58.divide(10);
    boolean b63 = money55.equals((java.lang.Object)money58);
    core.Money money65 = core.Money.dollars(10.0d);
    core.Money money67 = core.Money.dollars(10.0d);
    java.lang.String str68 = money67.toString();
    java.math.BigDecimal bigDecimal69 = money67.amount();
    core.Money money70 = money65.add(money67);
    core.Money money71 = money58.add(money70);
    core.Money money72 = money53.subtract(money58);
    core.Money money73 = money18.subtract(money72);
    core.Money money75 = core.Money.dollars(10.0d);
    core.Money money77 = core.Money.dollars(10.0d);
    core.Money money79 = core.Money.dollars(10.0d);
    java.lang.String str80 = money79.toString();
    java.math.BigDecimal bigDecimal81 = money79.amount();
    core.Money money82 = money77.add(money79);
    core.Money money83 = money75.subtract(money77);
    java.lang.String str84 = money77.toString();
    core.Money money86 = core.Money.dollars(10.0d);
    core.Money money88 = core.Money.dollars(10.0d);
    core.Money money90 = core.Money.dollars(10.0d);
    java.lang.String str91 = money90.toString();
    java.math.BigDecimal bigDecimal92 = money90.amount();
    core.Money money93 = money88.add(money90);
    core.Money money94 = money86.subtract(money88);
    core.Money money95 = money77.add(money94);
    money95.setAmount(1.0d);
    core.Money money98 = money73.add(money95);
    core.Money money99 = money1.add(money95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "$10.00"+ "'", str2.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "$10.00"+ "'", str23.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "$10.00"+ "'", str25.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "$10.00"+ "'", str28.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "$10.00"+ "'", str38.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "$10.00"+ "'", str44.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "$10.00"+ "'", str56.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "$10.00"+ "'", str59.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "$10.00"+ "'", str68.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "$10.00"+ "'", str80.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "$10.00"+ "'", str84.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "$10.00"+ "'", str91.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money99);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test20"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.lang.String str2 = money1.toString();
    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money[] money_array8 = money4.divide(10);
    boolean b9 = money1.equals((java.lang.Object)money4);
    core.Money money11 = core.Money.dollars(10.0d);
    core.Money money13 = core.Money.dollars(10.0d);
    java.lang.String str14 = money13.toString();
    java.math.BigDecimal bigDecimal15 = money13.amount();
    core.Money money16 = money11.add(money13);
    core.Money money17 = money4.add(money16);
    core.Money money19 = core.Money.dollars(10.0d);
    java.lang.String str20 = money19.toString();
    java.lang.String str21 = money19.toString();
    money19.setAmount(0.0d);
    core.Money money24 = money4.add(money19);
    core.Money money26 = core.Money.dollars(10.0d);
    java.lang.String str27 = money26.toString();
    java.math.BigDecimal bigDecimal28 = money26.amount();
    core.Money[] money_array30 = money26.divide(10);
    money26.setAmount(1.0d);
    java.lang.String str33 = money26.toString();
    boolean b34 = money4.equals(money26);
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    core.Money money39 = core.Money.dollars(10.0d);
    java.lang.String str40 = money39.toString();
    java.math.BigDecimal bigDecimal41 = money39.amount();
    core.Money[] money_array43 = money39.divide(10);
    boolean b44 = money36.equals((java.lang.Object)money39);
    core.Money money46 = core.Money.dollars(10.0d);
    core.Money money48 = core.Money.dollars(10.0d);
    java.lang.String str49 = money48.toString();
    java.math.BigDecimal bigDecimal50 = money48.amount();
    core.Money money51 = money46.add(money48);
    core.Money money53 = core.Money.dollars(10.0d);
    java.lang.String str54 = money53.toString();
    java.math.BigDecimal bigDecimal55 = money53.amount();
    core.Money[] money_array57 = money53.divide(10);
    core.Money money58 = money48.subtract(money53);
    core.Money money59 = money39.add(money58);
    core.Money money61 = core.Money.dollars(10.0d);
    java.lang.String str62 = money61.toString();
    java.math.BigDecimal bigDecimal63 = money61.amount();
    core.Money[] money_array65 = money61.divide(10);
    money61.setAmount(1.0d);
    java.lang.String str68 = money61.toString();
    money61.setAmount(10.0d);
    core.Money[] money_array72 = money61.divide(10);
    core.Money money73 = money59.subtract(money61);
    java.util.Currency currency74 = money73.getCurrency();
    java.util.Currency currency75 = money73.getCurrency();
    money4.setCurrency(currency75);
    java.math.BigDecimal bigDecimal77 = money4.amount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "$10.00"+ "'", str2.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "$10.00"+ "'", str20.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "$10.00"+ "'", str21.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "$10.00"+ "'", str27.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "$1.00"+ "'", str33.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "$10.00"+ "'", str37.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "$10.00"+ "'", str40.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "$10.00"+ "'", str49.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "$10.00"+ "'", str54.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "$10.00"+ "'", str62.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "$1.00"+ "'", str68.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal77);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test21"); }


    core.Money money1 = core.Money.dollars(10.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money money8 = money3.add(money5);
    core.Money money9 = money1.subtract(money3);
    java.lang.String str10 = money3.toString();
    core.Money money12 = core.Money.dollars(10.0d);
    core.Money money14 = core.Money.dollars(10.0d);
    core.Money money16 = core.Money.dollars(10.0d);
    java.lang.String str17 = money16.toString();
    java.math.BigDecimal bigDecimal18 = money16.amount();
    core.Money money19 = money14.add(money16);
    core.Money money20 = money12.subtract(money14);
    core.Money money21 = money3.add(money20);
    java.util.Currency currency22 = money20.getCurrency();
    core.Money money29 = core.Money.dollars(10.0d);
    java.lang.String str30 = money29.toString();
    java.math.BigDecimal bigDecimal31 = money29.amount();
    core.Money[] money_array33 = money29.divide(1);
    boolean b35 = money29.equals((java.lang.Object)(-1.0d));
    core.Money money37 = core.Money.dollars(10.0d);
    java.lang.String str38 = money37.toString();
    java.math.BigDecimal bigDecimal39 = money37.amount();
    java.util.Currency currency40 = money37.getCurrency();
    money29.setCurrency(currency40);
    core.Money money43 = core.Money.dollars(10.0d);
    java.lang.String str44 = money43.toString();
    java.math.BigDecimal bigDecimal45 = money43.amount();
    core.Money[] money_array47 = money43.divide(1);
    boolean b49 = money43.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale50 = money43.getLocale();
    core.Money money51 = new core.Money(1.0d, currency40, locale50);
    core.Money money53 = core.Money.dollars(10.0d);
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    java.math.BigDecimal bigDecimal57 = money55.amount();
    core.Money[] money_array59 = money55.divide(1);
    boolean b61 = money55.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale62 = money55.getLocale();
    money53.setLocale(locale62);
    core.Money money64 = new core.Money(1.0d, currency40, locale62);
    core.Money money65 = new core.Money(0L, currency40);
    core.Money money66 = new core.Money(0L, currency40);
    core.Money money67 = new core.Money(9.0d, currency40);
    money20.setCurrency(currency40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$10.00"+ "'", str10.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "$10.00"+ "'", str17.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "$10.00"+ "'", str30.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "$10.00"+ "'", str38.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "$10.00"+ "'", str44.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "$10.00"+ "'", str56.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale62);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test22"); }


    core.Money money2 = new core.Money();
    core.Money money4 = core.Money.dollars(10.0d);
    core.Money money6 = core.Money.dollars(10.0d);
    java.lang.String str7 = money6.toString();
    java.math.BigDecimal bigDecimal8 = money6.amount();
    core.Money money9 = money4.add(money6);
    core.Money money10 = money2.add(money6);
    core.Money money12 = core.Money.dollars(10.0d);
    core.Money money14 = core.Money.dollars(10.0d);
    java.lang.String str15 = money14.toString();
    java.math.BigDecimal bigDecimal16 = money14.amount();
    core.Money money17 = money12.add(money14);
    core.Money money19 = core.Money.dollars(10.0d);
    java.lang.String str20 = money19.toString();
    java.math.BigDecimal bigDecimal21 = money19.amount();
    core.Money[] money_array23 = money19.divide(10);
    core.Money money24 = money14.subtract(money19);
    core.Money money25 = money6.add(money24);
    core.Money money27 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal28 = money27.amount();
    money27.setAmount((-1.0d));
    core.Money money31 = money25.add(money27);
    java.util.Currency currency32 = money25.getCurrency();
    core.Money money33 = new core.Money(10L, currency32);
    core.Money money34 = new core.Money(11.0d, currency32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "$10.00"+ "'", str7.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$10.00"+ "'", str15.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "$10.00"+ "'", str20.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency32);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test23"); }


    core.Money money0 = new core.Money();
    core.Money money2 = core.Money.dollars(10.0d);
    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money money7 = money2.add(money4);
    core.Money money8 = money0.add(money4);
    core.Money money13 = core.Money.dollars(10.0d);
    java.lang.String str14 = money13.toString();
    java.math.BigDecimal bigDecimal15 = money13.amount();
    core.Money[] money_array17 = money13.divide(1);
    boolean b19 = money13.equals((java.lang.Object)(-1.0d));
    core.Money money21 = core.Money.dollars(10.0d);
    java.lang.String str22 = money21.toString();
    java.math.BigDecimal bigDecimal23 = money21.amount();
    java.util.Currency currency24 = money21.getCurrency();
    money13.setCurrency(currency24);
    core.Money money26 = new core.Money(100.0d, currency24);
    core.Money money28 = core.Money.dollars(10.0d);
    java.lang.String str29 = money28.toString();
    java.math.BigDecimal bigDecimal30 = money28.amount();
    core.Money[] money_array32 = money28.divide(10);
    money28.setAmount(1.0d);
    java.lang.String str35 = money28.toString();
    core.Money money38 = core.Money.dollars(10.0d);
    java.lang.String str39 = money38.toString();
    java.math.BigDecimal bigDecimal40 = money38.amount();
    core.Money[] money_array42 = money38.divide(1);
    boolean b44 = money38.equals((java.lang.Object)(-1.0d));
    core.Money money46 = core.Money.dollars(10.0d);
    java.lang.String str47 = money46.toString();
    java.math.BigDecimal bigDecimal48 = money46.amount();
    java.util.Currency currency49 = money46.getCurrency();
    money38.setCurrency(currency49);
    core.Money money52 = core.Money.dollars(10.0d);
    java.lang.String str53 = money52.toString();
    java.math.BigDecimal bigDecimal54 = money52.amount();
    core.Money[] money_array56 = money52.divide(1);
    boolean b58 = money52.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale59 = money52.getLocale();
    core.Money money60 = new core.Money(1.0d, currency49, locale59);
    money28.setCurrency(currency49);
    core.Money money63 = core.Money.dollars(10.0d);
    core.Money money65 = core.Money.dollars(10.0d);
    core.Money money67 = core.Money.dollars(10.0d);
    java.lang.String str68 = money67.toString();
    java.math.BigDecimal bigDecimal69 = money67.amount();
    core.Money money70 = money65.add(money67);
    core.Money money71 = money63.subtract(money65);
    core.Money money73 = core.Money.dollars(10.0d);
    java.lang.String str74 = money73.toString();
    java.math.BigDecimal bigDecimal75 = money73.amount();
    core.Money[] money_array77 = money73.divide(1);
    boolean b79 = money73.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale80 = money73.getLocale();
    money65.setLocale(locale80);
    money28.setLocale(locale80);
    core.Money money83 = new core.Money(1.0d, currency24, locale80);
    core.Money money84 = new core.Money(10L, currency24);
    java.util.Currency currency85 = money84.getCurrency();
    core.Money money86 = money4.subtract(money84);
    java.util.Locale locale87 = money86.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "$10.00"+ "'", str22.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "$10.00"+ "'", str29.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "$1.00"+ "'", str35.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "$10.00"+ "'", str39.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "$10.00"+ "'", str47.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "$10.00"+ "'", str53.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "$10.00"+ "'", str68.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "$10.00"+ "'", str74.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale87);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test24"); }


    core.Money money0 = new core.Money();
    core.Money money2 = core.Money.dollars(10.0d);
    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money money7 = money2.add(money4);
    core.Money money8 = money0.add(money4);
    core.Money money10 = core.Money.dollars(10.0d);
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    java.math.BigDecimal bigDecimal14 = money12.amount();
    core.Money money15 = money10.add(money12);
    core.Money money17 = core.Money.dollars(10.0d);
    java.lang.String str18 = money17.toString();
    java.math.BigDecimal bigDecimal19 = money17.amount();
    core.Money[] money_array21 = money17.divide(10);
    core.Money money22 = money12.subtract(money17);
    core.Money money23 = money4.add(money22);
    core.Money money25 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal26 = money25.amount();
    money25.setAmount((-1.0d));
    core.Money money29 = money23.add(money25);
    core.Money money31 = core.Money.dollars(10.0d);
    java.lang.String str32 = money31.toString();
    core.Money money34 = core.Money.dollars(10.0d);
    java.lang.String str35 = money34.toString();
    java.math.BigDecimal bigDecimal36 = money34.amount();
    core.Money[] money_array38 = money34.divide(10);
    boolean b39 = money31.equals((java.lang.Object)money34);
    core.Money money41 = core.Money.dollars(10.0d);
    core.Money money43 = core.Money.dollars(10.0d);
    java.lang.String str44 = money43.toString();
    java.math.BigDecimal bigDecimal45 = money43.amount();
    core.Money money46 = money41.add(money43);
    core.Money money47 = money34.add(money46);
    java.math.BigDecimal bigDecimal48 = money47.amount();
    money47.setAmount(9.0d);
    boolean b51 = money29.equals((java.lang.Object)9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "$10.00"+ "'", str18.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "$10.00"+ "'", str32.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "$10.00"+ "'", str35.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "$10.00"+ "'", str44.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test25"); }


    core.Money money8 = core.Money.dollars(10.0d);
    java.lang.String str9 = money8.toString();
    java.math.BigDecimal bigDecimal10 = money8.amount();
    core.Money[] money_array12 = money8.divide(1);
    boolean b14 = money8.equals((java.lang.Object)(-1.0d));
    core.Money money16 = core.Money.dollars(10.0d);
    java.lang.String str17 = money16.toString();
    java.math.BigDecimal bigDecimal18 = money16.amount();
    java.util.Currency currency19 = money16.getCurrency();
    money8.setCurrency(currency19);
    core.Money money21 = new core.Money(10.0d, currency19);
    core.Money money22 = new core.Money(1.0d, currency19);
    core.Money money23 = new core.Money(10.0d, currency19);
    core.Money money24 = new core.Money(100L, currency19);
    core.Money money25 = new core.Money(10.0d, currency19);
    core.Money money27 = new core.Money();
    core.Money money29 = core.Money.dollars(10.0d);
    core.Money money31 = core.Money.dollars(10.0d);
    java.lang.String str32 = money31.toString();
    java.math.BigDecimal bigDecimal33 = money31.amount();
    core.Money money34 = money29.add(money31);
    core.Money money35 = money27.add(money31);
    core.Money money37 = core.Money.dollars(10.0d);
    core.Money money39 = core.Money.dollars(10.0d);
    java.lang.String str40 = money39.toString();
    java.math.BigDecimal bigDecimal41 = money39.amount();
    core.Money money42 = money37.add(money39);
    core.Money money44 = core.Money.dollars(10.0d);
    java.lang.String str45 = money44.toString();
    java.math.BigDecimal bigDecimal46 = money44.amount();
    core.Money[] money_array48 = money44.divide(10);
    core.Money money49 = money39.subtract(money44);
    core.Money money50 = money31.add(money49);
    core.Money money52 = core.Money.dollars(10.0d);
    java.lang.String str53 = money52.toString();
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    java.math.BigDecimal bigDecimal57 = money55.amount();
    core.Money[] money_array59 = money55.divide(10);
    boolean b60 = money52.equals((java.lang.Object)money55);
    core.Money money62 = core.Money.dollars(10.0d);
    core.Money money64 = core.Money.dollars(10.0d);
    java.lang.String str65 = money64.toString();
    java.math.BigDecimal bigDecimal66 = money64.amount();
    core.Money money67 = money62.add(money64);
    core.Money money68 = money55.add(money67);
    core.Money money70 = core.Money.dollars(10.0d);
    core.Money money71 = money68.add(money70);
    java.util.Currency currency72 = money71.getCurrency();
    money49.setCurrency(currency72);
    core.Money money74 = new core.Money();
    core.Money money76 = core.Money.dollars(10.0d);
    core.Money money78 = core.Money.dollars(10.0d);
    java.lang.String str79 = money78.toString();
    java.math.BigDecimal bigDecimal80 = money78.amount();
    core.Money money81 = money76.add(money78);
    core.Money money82 = money74.add(money78);
    java.util.Locale locale83 = money82.getLocale();
    core.Money money84 = new core.Money(1.0d, currency72, locale83);
    core.Money money85 = new core.Money(70.0d, currency19, locale83);
    core.Money money86 = new core.Money(10.0d, currency19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$10.00"+ "'", str9.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "$10.00"+ "'", str17.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "$10.00"+ "'", str32.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "$10.00"+ "'", str40.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "$10.00"+ "'", str45.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "$10.00"+ "'", str53.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "$10.00"+ "'", str56.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "$10.00"+ "'", str65.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "$10.00"+ "'", str79.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale83);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test26"); }


    core.Money money6 = core.Money.dollars(10.0d);
    java.lang.String str7 = money6.toString();
    java.math.BigDecimal bigDecimal8 = money6.amount();
    java.lang.String str9 = money6.toString();
    core.Money money11 = core.Money.dollars(10.0d);
    java.lang.String str12 = money11.toString();
    java.math.BigDecimal bigDecimal13 = money11.amount();
    java.util.Currency currency14 = money11.getCurrency();
    money6.setCurrency(currency14);
    core.Money money17 = core.Money.dollars(10.0d);
    core.Money money19 = core.Money.dollars(10.0d);
    core.Money money21 = core.Money.dollars(10.0d);
    java.lang.String str22 = money21.toString();
    java.math.BigDecimal bigDecimal23 = money21.amount();
    core.Money money24 = money19.add(money21);
    core.Money money25 = money17.subtract(money19);
    core.Money money27 = core.Money.dollars(10.0d);
    java.lang.String str28 = money27.toString();
    java.math.BigDecimal bigDecimal29 = money27.amount();
    core.Money[] money_array31 = money27.divide(1);
    boolean b33 = money27.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale34 = money27.getLocale();
    money19.setLocale(locale34);
    core.Money money36 = new core.Money(100.0d, currency14, locale34);
    core.Money money37 = new core.Money(10.0d, currency14);
    core.Money money38 = new core.Money(100L, currency14);
    core.Money money39 = new core.Money((-1L), currency14);
    core.Money money41 = core.Money.dollars(1.0d);
    boolean b42 = money39.equals(money41);
    core.Money money44 = core.Money.dollars(10.0d);
    core.Money money46 = core.Money.dollars(10.0d);
    java.lang.String str47 = money46.toString();
    java.math.BigDecimal bigDecimal48 = money46.amount();
    core.Money money49 = money44.add(money46);
    core.Money money51 = core.Money.dollars(10.0d);
    java.lang.String str52 = money51.toString();
    java.math.BigDecimal bigDecimal53 = money51.amount();
    core.Money[] money_array55 = money51.divide(10);
    core.Money money56 = money46.subtract(money51);
    core.Money money59 = core.Money.dollars(10.0d);
    java.lang.String str60 = money59.toString();
    java.math.BigDecimal bigDecimal61 = money59.amount();
    java.lang.String str62 = money59.toString();
    core.Money money64 = core.Money.dollars(10.0d);
    java.lang.String str65 = money64.toString();
    java.math.BigDecimal bigDecimal66 = money64.amount();
    java.util.Currency currency67 = money64.getCurrency();
    money59.setCurrency(currency67);
    core.Money money69 = new core.Money(100L, currency67);
    core.Money money70 = money46.add(money69);
    java.math.BigDecimal bigDecimal71 = money46.amount();
    java.util.Currency currency72 = money46.getCurrency();
    money41.setCurrency(currency72);
    core.Money money74 = new core.Money(10L, currency72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "$10.00"+ "'", str7.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$10.00"+ "'", str9.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "$10.00"+ "'", str12.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "$10.00"+ "'", str22.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "$10.00"+ "'", str28.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "$10.00"+ "'", str47.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "$10.00"+ "'", str52.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "$10.00"+ "'", str60.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "$10.00"+ "'", str62.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "$10.00"+ "'", str65.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency72);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test27"); }


    core.Money money1 = new core.Money();
    core.Money money3 = core.Money.dollars(10.0d);
    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money money8 = money3.add(money5);
    core.Money money9 = money1.add(money5);
    core.Money money11 = core.Money.dollars(10.0d);
    core.Money money13 = core.Money.dollars(10.0d);
    java.lang.String str14 = money13.toString();
    java.math.BigDecimal bigDecimal15 = money13.amount();
    core.Money money16 = money11.add(money13);
    core.Money money18 = core.Money.dollars(10.0d);
    java.lang.String str19 = money18.toString();
    java.math.BigDecimal bigDecimal20 = money18.amount();
    core.Money[] money_array22 = money18.divide(10);
    core.Money money23 = money13.subtract(money18);
    core.Money money24 = money5.add(money23);
    core.Money money26 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal27 = money26.amount();
    money26.setAmount((-1.0d));
    core.Money money30 = money24.add(money26);
    java.util.Currency currency31 = money24.getCurrency();
    core.Money money32 = new core.Money(11.0d, currency31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "$10.00"+ "'", str19.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency31);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test28"); }


    core.Money money0 = new core.Money();
    core.Money money2 = core.Money.dollars(10.0d);
    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money money7 = money2.add(money4);
    core.Money money8 = money0.add(money4);
    core.Money money10 = core.Money.dollars(10.0d);
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    java.math.BigDecimal bigDecimal14 = money12.amount();
    core.Money money15 = money10.add(money12);
    core.Money money17 = core.Money.dollars(10.0d);
    java.lang.String str18 = money17.toString();
    java.math.BigDecimal bigDecimal19 = money17.amount();
    core.Money[] money_array21 = money17.divide(10);
    core.Money money22 = money12.subtract(money17);
    core.Money money23 = money4.add(money22);
    core.Money money25 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal26 = money25.amount();
    money25.setAmount((-1.0d));
    core.Money money29 = money23.add(money25);
    java.util.Currency currency30 = money23.getCurrency();
    money23.setAmount(100.0d);
    core.Money[] money_array34 = money23.divide(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "$10.00"+ "'", str18.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array34);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test29"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.lang.String str2 = money1.toString();
    java.math.BigDecimal bigDecimal3 = money1.amount();
    java.util.Currency currency4 = money1.getCurrency();
    core.Money money9 = core.Money.dollars(10.0d);
    java.lang.String str10 = money9.toString();
    java.math.BigDecimal bigDecimal11 = money9.amount();
    core.Money[] money_array13 = money9.divide(1);
    boolean b15 = money9.equals((java.lang.Object)(-1.0d));
    core.Money money17 = core.Money.dollars(10.0d);
    java.lang.String str18 = money17.toString();
    java.math.BigDecimal bigDecimal19 = money17.amount();
    java.util.Currency currency20 = money17.getCurrency();
    money9.setCurrency(currency20);
    core.Money money22 = new core.Money(10.0d, currency20);
    core.Money money23 = new core.Money(1.0d, currency20);
    core.Money money24 = new core.Money(0L, currency20);
    core.Money money25 = money1.subtract(money24);
    java.math.BigDecimal bigDecimal26 = money25.amount();
    core.Money money29 = core.Money.dollars(10.0d);
    java.lang.String str30 = money29.toString();
    java.math.BigDecimal bigDecimal31 = money29.amount();
    core.Money[] money_array33 = money29.divide(1);
    boolean b35 = money29.equals((java.lang.Object)(-1.0d));
    core.Money money37 = core.Money.dollars(10.0d);
    java.lang.String str38 = money37.toString();
    java.math.BigDecimal bigDecimal39 = money37.amount();
    java.util.Currency currency40 = money37.getCurrency();
    money29.setCurrency(currency40);
    core.Money money42 = new core.Money(10.0d, currency40);
    money25.setCurrency(currency40);
    core.Money money45 = core.Money.dollars(10.0d);
    core.Money money47 = core.Money.dollars(10.0d);
    core.Money money49 = core.Money.dollars(10.0d);
    java.lang.String str50 = money49.toString();
    java.math.BigDecimal bigDecimal51 = money49.amount();
    core.Money money52 = money47.add(money49);
    core.Money money53 = money45.subtract(money47);
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    java.math.BigDecimal bigDecimal57 = money55.amount();
    core.Money[] money_array59 = money55.divide(1);
    boolean b61 = money55.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale62 = money55.getLocale();
    money47.setLocale(locale62);
    core.Money money65 = core.Money.dollars(10.0d);
    core.Money money67 = core.Money.dollars(10.0d);
    core.Money money69 = core.Money.dollars(10.0d);
    java.lang.String str70 = money69.toString();
    java.math.BigDecimal bigDecimal71 = money69.amount();
    core.Money money72 = money67.add(money69);
    core.Money money73 = money65.subtract(money67);
    java.math.BigDecimal bigDecimal74 = money65.amount();
    boolean b75 = money47.equals(money65);
    core.Money money77 = core.Money.dollars(11.0d);
    java.lang.String str78 = money77.toString();
    java.math.BigDecimal bigDecimal79 = money77.amount();
    core.Money money80 = money65.subtract(money77);
    core.Money money81 = money25.add(money65);
    core.Money money84 = core.Money.dollars(10.0d);
    java.lang.String str85 = money84.toString();
    java.math.BigDecimal bigDecimal86 = money84.amount();
    java.lang.String str87 = money84.toString();
    core.Money money89 = core.Money.dollars(10.0d);
    java.lang.String str90 = money89.toString();
    java.math.BigDecimal bigDecimal91 = money89.amount();
    java.util.Currency currency92 = money89.getCurrency();
    money84.setCurrency(currency92);
    core.Money money94 = new core.Money(0.0d, currency92);
    java.util.Locale locale95 = money94.getLocale();
    money81.setLocale(locale95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "$10.00"+ "'", str2.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$10.00"+ "'", str10.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "$10.00"+ "'", str18.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "$10.00"+ "'", str30.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "$10.00"+ "'", str38.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "$10.00"+ "'", str50.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "$10.00"+ "'", str56.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "$10.00"+ "'", str70.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "$11.00"+ "'", str78.equals("$11.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "$10.00"+ "'", str85.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "$10.00"+ "'", str87.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "$10.00"+ "'", str90.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale95);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test30"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal2 = money1.amount();
    core.Money[] money_array4 = money1.divide(100);
    core.Money money6 = core.Money.dollars(10.0d);
    java.lang.String str7 = money6.toString();
    core.Money money9 = core.Money.dollars(10.0d);
    java.lang.String str10 = money9.toString();
    java.math.BigDecimal bigDecimal11 = money9.amount();
    core.Money[] money_array13 = money9.divide(10);
    boolean b14 = money6.equals((java.lang.Object)money9);
    boolean b15 = money1.equals(money6);
    java.lang.String str16 = money6.toString();
    java.lang.String str17 = money6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "$10.00"+ "'", str7.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$10.00"+ "'", str10.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "$10.00"+ "'", str16.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "$10.00"+ "'", str17.equals("$10.00"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test31"); }


    core.Money money1 = core.Money.dollars(10.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    java.lang.String str4 = money3.toString();
    java.math.BigDecimal bigDecimal5 = money3.amount();
    core.Money money6 = money1.add(money3);
    core.Money money8 = core.Money.dollars(10.0d);
    java.lang.String str9 = money8.toString();
    java.math.BigDecimal bigDecimal10 = money8.amount();
    core.Money[] money_array12 = money8.divide(10);
    core.Money money13 = money3.subtract(money8);
    java.util.Locale locale14 = money8.getLocale();
    java.lang.String str15 = money8.toString();
    java.lang.Object obj16 = null;
    boolean b17 = money8.equals(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "$10.00"+ "'", str4.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$10.00"+ "'", str9.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$10.00"+ "'", str15.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test32"); }


    core.Money money0 = new core.Money();
    core.Money money2 = core.Money.dollars(10.0d);
    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money money7 = money2.add(money4);
    core.Money money8 = money0.add(money4);
    java.lang.String str9 = money0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$0.00"+ "'", str9.equals("$0.00"));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test33"); }


    core.Money money2 = core.Money.dollars(10.0d);
    java.lang.String str3 = money2.toString();
    java.math.BigDecimal bigDecimal4 = money2.amount();
    java.lang.String str5 = money2.toString();
    core.Money money7 = core.Money.dollars(10.0d);
    java.lang.String str8 = money7.toString();
    java.math.BigDecimal bigDecimal9 = money7.amount();
    java.util.Currency currency10 = money7.getCurrency();
    money2.setCurrency(currency10);
    core.Money money12 = new core.Money(100L, currency10);
    core.Money money15 = core.Money.dollars(10.0d);
    java.lang.String str16 = money15.toString();
    java.math.BigDecimal bigDecimal17 = money15.amount();
    core.Money[] money_array19 = money15.divide(10);
    money15.setAmount(1.0d);
    java.lang.String str22 = money15.toString();
    core.Money money25 = core.Money.dollars(10.0d);
    java.lang.String str26 = money25.toString();
    java.math.BigDecimal bigDecimal27 = money25.amount();
    core.Money[] money_array29 = money25.divide(1);
    boolean b31 = money25.equals((java.lang.Object)(-1.0d));
    core.Money money33 = core.Money.dollars(10.0d);
    java.lang.String str34 = money33.toString();
    java.math.BigDecimal bigDecimal35 = money33.amount();
    java.util.Currency currency36 = money33.getCurrency();
    money25.setCurrency(currency36);
    core.Money money39 = core.Money.dollars(10.0d);
    java.lang.String str40 = money39.toString();
    java.math.BigDecimal bigDecimal41 = money39.amount();
    core.Money[] money_array43 = money39.divide(1);
    boolean b45 = money39.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale46 = money39.getLocale();
    core.Money money47 = new core.Money(1.0d, currency36, locale46);
    money15.setCurrency(currency36);
    core.Money money50 = core.Money.dollars(10.0d);
    core.Money money52 = core.Money.dollars(10.0d);
    core.Money money54 = core.Money.dollars(10.0d);
    java.lang.String str55 = money54.toString();
    java.math.BigDecimal bigDecimal56 = money54.amount();
    core.Money money57 = money52.add(money54);
    core.Money money58 = money50.subtract(money52);
    core.Money money60 = core.Money.dollars(10.0d);
    java.lang.String str61 = money60.toString();
    java.math.BigDecimal bigDecimal62 = money60.amount();
    core.Money[] money_array64 = money60.divide(1);
    boolean b66 = money60.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale67 = money60.getLocale();
    money52.setLocale(locale67);
    core.Money money69 = new core.Money(1.0d, currency36, locale67);
    money12.setLocale(locale67);
    java.lang.String str71 = money12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "$10.00"+ "'", str3.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "$10.00"+ "'", str8.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "$10.00"+ "'", str16.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "$1.00"+ "'", str22.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "$10.00"+ "'", str26.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "$10.00"+ "'", str34.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "$10.00"+ "'", str40.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "$10.00"+ "'", str55.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "$10.00"+ "'", str61.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "$100.00"+ "'", str71.equals("$100.00"));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test34"); }


    core.Money money2 = core.Money.dollars(10.0d);
    java.lang.String str3 = money2.toString();
    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money[] money_array9 = money5.divide(10);
    boolean b10 = money2.equals((java.lang.Object)money5);
    core.Money money12 = core.Money.dollars(10.0d);
    core.Money money14 = core.Money.dollars(10.0d);
    java.lang.String str15 = money14.toString();
    java.math.BigDecimal bigDecimal16 = money14.amount();
    core.Money money17 = money12.add(money14);
    core.Money money19 = core.Money.dollars(10.0d);
    java.lang.String str20 = money19.toString();
    java.math.BigDecimal bigDecimal21 = money19.amount();
    core.Money[] money_array23 = money19.divide(10);
    core.Money money24 = money14.subtract(money19);
    core.Money money25 = money5.add(money24);
    core.Money money29 = core.Money.dollars(10.0d);
    java.lang.String str30 = money29.toString();
    java.math.BigDecimal bigDecimal31 = money29.amount();
    core.Money[] money_array33 = money29.divide(1);
    boolean b35 = money29.equals((java.lang.Object)(-1.0d));
    core.Money money37 = core.Money.dollars(10.0d);
    java.lang.String str38 = money37.toString();
    java.math.BigDecimal bigDecimal39 = money37.amount();
    java.util.Currency currency40 = money37.getCurrency();
    money29.setCurrency(currency40);
    core.Money money42 = new core.Money(10.0d, currency40);
    core.Money money43 = new core.Money(1.0d, currency40);
    money24.setCurrency(currency40);
    core.Money money45 = new core.Money(1L, currency40);
    java.lang.String str46 = money45.toString();
    core.Money money48 = core.Money.dollars(10.0d);
    java.lang.String str49 = money48.toString();
    core.Money money51 = core.Money.dollars(10.0d);
    java.lang.String str52 = money51.toString();
    java.math.BigDecimal bigDecimal53 = money51.amount();
    core.Money[] money_array55 = money51.divide(10);
    boolean b56 = money48.equals((java.lang.Object)money51);
    core.Money money58 = core.Money.dollars(10.0d);
    core.Money money60 = core.Money.dollars(10.0d);
    java.lang.String str61 = money60.toString();
    java.math.BigDecimal bigDecimal62 = money60.amount();
    core.Money money63 = money58.add(money60);
    core.Money money64 = money51.add(money63);
    java.lang.String str65 = money51.toString();
    core.Money money66 = money45.subtract(money51);
    java.util.Currency currency67 = money51.getCurrency();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "$10.00"+ "'", str3.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$10.00"+ "'", str15.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "$10.00"+ "'", str20.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "$10.00"+ "'", str30.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "$10.00"+ "'", str38.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "$1.00"+ "'", str46.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "$10.00"+ "'", str49.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "$10.00"+ "'", str52.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "$10.00"+ "'", str61.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "$10.00"+ "'", str65.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency67);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test35"); }


    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money[] money_array8 = money4.divide(1);
    boolean b10 = money4.equals((java.lang.Object)(-1.0d));
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    java.math.BigDecimal bigDecimal14 = money12.amount();
    java.util.Currency currency15 = money12.getCurrency();
    money4.setCurrency(currency15);
    core.Money money17 = new core.Money(10.0d, currency15);
    core.Money money18 = new core.Money(1.0d, currency15);
    core.Money money19 = new core.Money(1L, currency15);
    core.Money money21 = core.Money.dollars(10.0d);
    core.Money money23 = core.Money.dollars(10.0d);
    core.Money money25 = core.Money.dollars(10.0d);
    java.lang.String str26 = money25.toString();
    java.math.BigDecimal bigDecimal27 = money25.amount();
    core.Money money28 = money23.add(money25);
    core.Money money29 = money21.subtract(money23);
    java.lang.String str30 = money23.toString();
    core.Money money32 = core.Money.dollars(10.0d);
    java.lang.String str33 = money32.toString();
    core.Money money35 = core.Money.dollars(10.0d);
    java.lang.String str36 = money35.toString();
    java.math.BigDecimal bigDecimal37 = money35.amount();
    core.Money[] money_array39 = money35.divide(10);
    boolean b40 = money32.equals((java.lang.Object)money35);
    core.Money money42 = core.Money.dollars(10.0d);
    core.Money money44 = core.Money.dollars(10.0d);
    java.lang.String str45 = money44.toString();
    java.math.BigDecimal bigDecimal46 = money44.amount();
    core.Money money47 = money42.add(money44);
    core.Money money48 = money35.add(money47);
    core.Money money50 = core.Money.dollars(10.0d);
    core.Money money51 = money48.add(money50);
    boolean b52 = money23.equals(money48);
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    java.math.BigDecimal bigDecimal57 = money55.amount();
    java.util.Currency currency58 = money55.getCurrency();
    core.Money money59 = new core.Money(0L, currency58);
    boolean b60 = money48.equals(money59);
    core.Money money62 = core.Money.dollars(10.0d);
    java.lang.String str63 = money62.toString();
    java.math.BigDecimal bigDecimal64 = money62.amount();
    core.Money[] money_array66 = money62.divide(10);
    money62.setAmount(1.0d);
    java.lang.String str69 = money62.toString();
    core.Money money72 = core.Money.dollars(10.0d);
    java.lang.String str73 = money72.toString();
    java.math.BigDecimal bigDecimal74 = money72.amount();
    core.Money[] money_array76 = money72.divide(1);
    boolean b78 = money72.equals((java.lang.Object)(-1.0d));
    core.Money money80 = core.Money.dollars(10.0d);
    java.lang.String str81 = money80.toString();
    java.math.BigDecimal bigDecimal82 = money80.amount();
    java.util.Currency currency83 = money80.getCurrency();
    money72.setCurrency(currency83);
    core.Money money86 = core.Money.dollars(10.0d);
    java.lang.String str87 = money86.toString();
    java.math.BigDecimal bigDecimal88 = money86.amount();
    core.Money[] money_array90 = money86.divide(1);
    boolean b92 = money86.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale93 = money86.getLocale();
    core.Money money94 = new core.Money(1.0d, currency83, locale93);
    money62.setCurrency(currency83);
    core.Money money96 = money59.add(money62);
    boolean b97 = money19.equals((java.lang.Object)money62);
    java.lang.String str98 = money19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "$10.00"+ "'", str26.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "$10.00"+ "'", str30.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "$10.00"+ "'", str33.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "$10.00"+ "'", str36.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "$10.00"+ "'", str45.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "$10.00"+ "'", str56.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "$10.00"+ "'", str63.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "$1.00"+ "'", str69.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "$10.00"+ "'", str73.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "$10.00"+ "'", str81.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "$10.00"+ "'", str87.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str98 + "' != '" + "$1.00"+ "'", str98.equals("$1.00"));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test36"); }


    core.Money money8 = core.Money.dollars(10.0d);
    java.lang.String str9 = money8.toString();
    java.math.BigDecimal bigDecimal10 = money8.amount();
    core.Money[] money_array12 = money8.divide(1);
    boolean b14 = money8.equals((java.lang.Object)(-1.0d));
    core.Money money16 = core.Money.dollars(10.0d);
    java.lang.String str17 = money16.toString();
    java.math.BigDecimal bigDecimal18 = money16.amount();
    java.util.Currency currency19 = money16.getCurrency();
    money8.setCurrency(currency19);
    core.Money money21 = new core.Money(10.0d, currency19);
    core.Money money22 = new core.Money(1.0d, currency19);
    core.Money money23 = new core.Money(0L, currency19);
    core.Money money27 = core.Money.dollars(10.0d);
    java.lang.String str28 = money27.toString();
    java.math.BigDecimal bigDecimal29 = money27.amount();
    core.Money[] money_array31 = money27.divide(1);
    boolean b33 = money27.equals((java.lang.Object)(-1.0d));
    core.Money money35 = core.Money.dollars(10.0d);
    java.lang.String str36 = money35.toString();
    java.math.BigDecimal bigDecimal37 = money35.amount();
    java.util.Currency currency38 = money35.getCurrency();
    money27.setCurrency(currency38);
    core.Money money41 = core.Money.dollars(10.0d);
    java.lang.String str42 = money41.toString();
    java.math.BigDecimal bigDecimal43 = money41.amount();
    core.Money[] money_array45 = money41.divide(1);
    boolean b47 = money41.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale48 = money41.getLocale();
    core.Money money49 = new core.Money(1.0d, currency38, locale48);
    core.Money money51 = core.Money.dollars(10.0d);
    core.Money money53 = core.Money.dollars(10.0d);
    java.lang.String str54 = money53.toString();
    java.math.BigDecimal bigDecimal55 = money53.amount();
    core.Money[] money_array57 = money53.divide(1);
    boolean b59 = money53.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale60 = money53.getLocale();
    money51.setLocale(locale60);
    core.Money money62 = new core.Money(1.0d, currency38, locale60);
    core.Money money63 = new core.Money(0.0d, currency19, locale60);
    java.util.Locale locale64 = money63.getLocale();
    money63.setAmount(100.0d);
    java.util.Currency currency67 = money63.getCurrency();
    core.Money money68 = new core.Money(0.0d, currency67);
    core.Money money69 = new core.Money(1.0d, currency67);
    core.Money money70 = new core.Money(1L, currency67);
    java.lang.String str71 = money70.toString();
    core.Money money72 = new core.Money();
    core.Money money74 = core.Money.dollars(10.0d);
    core.Money money76 = core.Money.dollars(10.0d);
    java.lang.String str77 = money76.toString();
    java.math.BigDecimal bigDecimal78 = money76.amount();
    core.Money money79 = money74.add(money76);
    core.Money money80 = money72.add(money76);
    boolean b81 = money70.equals(money80);
    java.util.Locale locale82 = money70.getLocale();
    java.lang.Object obj83 = null;
    boolean b84 = money70.equals(obj83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "$10.00"+ "'", str9.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "$10.00"+ "'", str17.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "$10.00"+ "'", str28.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "$10.00"+ "'", str36.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "$10.00"+ "'", str42.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "$10.00"+ "'", str54.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "$1.00"+ "'", str71.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "$10.00"+ "'", str77.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test37"); }


    core.Money money1 = core.Money.dollars(10.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money money8 = money3.add(money5);
    core.Money money9 = money1.subtract(money3);
    java.lang.String str10 = money3.toString();
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    core.Money money15 = core.Money.dollars(10.0d);
    java.lang.String str16 = money15.toString();
    java.math.BigDecimal bigDecimal17 = money15.amount();
    core.Money[] money_array19 = money15.divide(10);
    boolean b20 = money12.equals((java.lang.Object)money15);
    core.Money money22 = core.Money.dollars(10.0d);
    core.Money money24 = core.Money.dollars(10.0d);
    java.lang.String str25 = money24.toString();
    java.math.BigDecimal bigDecimal26 = money24.amount();
    core.Money money27 = money22.add(money24);
    core.Money money28 = money15.add(money27);
    core.Money money30 = core.Money.dollars(10.0d);
    core.Money money31 = money28.add(money30);
    boolean b32 = money3.equals(money28);
    core.Money money35 = core.Money.dollars(10.0d);
    java.lang.String str36 = money35.toString();
    java.math.BigDecimal bigDecimal37 = money35.amount();
    java.util.Currency currency38 = money35.getCurrency();
    core.Money money39 = new core.Money(0L, currency38);
    boolean b40 = money28.equals(money39);
    core.Money[] money_array42 = money39.divide(100);
    java.lang.String str43 = money39.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$10.00"+ "'", str10.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "$10.00"+ "'", str16.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "$10.00"+ "'", str25.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "$10.00"+ "'", str36.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "$0.00"+ "'", str43.equals("$0.00"));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test38"); }


    core.Money money3 = core.Money.dollars(10.0d);
    java.lang.String str4 = money3.toString();
    java.math.BigDecimal bigDecimal5 = money3.amount();
    core.Money[] money_array7 = money3.divide(10);
    money3.setAmount(1.0d);
    java.lang.String str10 = money3.toString();
    core.Money money13 = core.Money.dollars(10.0d);
    java.lang.String str14 = money13.toString();
    java.math.BigDecimal bigDecimal15 = money13.amount();
    core.Money[] money_array17 = money13.divide(1);
    boolean b19 = money13.equals((java.lang.Object)(-1.0d));
    core.Money money21 = core.Money.dollars(10.0d);
    java.lang.String str22 = money21.toString();
    java.math.BigDecimal bigDecimal23 = money21.amount();
    java.util.Currency currency24 = money21.getCurrency();
    money13.setCurrency(currency24);
    core.Money money27 = core.Money.dollars(10.0d);
    java.lang.String str28 = money27.toString();
    java.math.BigDecimal bigDecimal29 = money27.amount();
    core.Money[] money_array31 = money27.divide(1);
    boolean b33 = money27.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale34 = money27.getLocale();
    core.Money money35 = new core.Money(1.0d, currency24, locale34);
    money3.setCurrency(currency24);
    core.Money money37 = new core.Money(1L, currency24);
    core.Money money39 = core.Money.dollars(10.0d);
    core.Money money41 = core.Money.dollars(10.0d);
    java.lang.String str42 = money41.toString();
    java.math.BigDecimal bigDecimal43 = money41.amount();
    core.Money[] money_array45 = money41.divide(1);
    boolean b47 = money41.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale48 = money41.getLocale();
    money39.setLocale(locale48);
    core.Money money50 = new core.Money(10.0d, currency24, locale48);
    core.Money[] money_array52 = money50.divide(10);
    java.util.Locale locale53 = money50.getLocale();
    java.util.Currency currency54 = money50.getCurrency();
    java.lang.String str55 = money50.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "$10.00"+ "'", str4.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "$1.00"+ "'", str10.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "$10.00"+ "'", str22.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "$10.00"+ "'", str28.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "$10.00"+ "'", str42.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "$10.00"+ "'", str55.equals("$10.00"));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test39"); }


    core.Money money0 = new core.Money();
    core.Money money2 = core.Money.dollars(10.0d);
    core.Money money4 = core.Money.dollars(10.0d);
    java.lang.String str5 = money4.toString();
    java.math.BigDecimal bigDecimal6 = money4.amount();
    core.Money money7 = money2.add(money4);
    core.Money money8 = money0.add(money4);
    core.Money money10 = core.Money.dollars(10.0d);
    core.Money money12 = core.Money.dollars(10.0d);
    java.lang.String str13 = money12.toString();
    java.math.BigDecimal bigDecimal14 = money12.amount();
    core.Money money15 = money10.add(money12);
    boolean b16 = money8.equals(money12);
    java.util.Currency currency17 = money8.getCurrency();
    java.lang.String str18 = money8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "$10.00"+ "'", str13.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "$10.00"+ "'", str18.equals("$10.00"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test40"); }


    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money[] money_array9 = money5.divide(1);
    boolean b11 = money5.equals((java.lang.Object)(-1.0d));
    core.Money money13 = core.Money.dollars(10.0d);
    java.lang.String str14 = money13.toString();
    java.math.BigDecimal bigDecimal15 = money13.amount();
    java.util.Currency currency16 = money13.getCurrency();
    money5.setCurrency(currency16);
    core.Money money18 = new core.Money(10.0d, currency16);
    core.Money money19 = new core.Money(1.0d, currency16);
    core.Money money20 = new core.Money(10.0d, currency16);
    core.Money money21 = new core.Money(100L, currency16);
    java.math.BigDecimal bigDecimal22 = money21.amount();
    java.util.Currency currency23 = money21.getCurrency();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency23);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test41"); }


    core.Money money2 = core.Money.dollars(10.0d);
    java.lang.String str3 = money2.toString();
    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money[] money_array9 = money5.divide(10);
    boolean b10 = money2.equals((java.lang.Object)money5);
    core.Money money12 = core.Money.dollars(10.0d);
    core.Money money14 = core.Money.dollars(10.0d);
    java.lang.String str15 = money14.toString();
    java.math.BigDecimal bigDecimal16 = money14.amount();
    core.Money money17 = money12.add(money14);
    core.Money money18 = money5.add(money17);
    core.Money money20 = core.Money.dollars(10.0d);
    core.Money money21 = money18.add(money20);
    java.util.Currency currency22 = money20.getCurrency();
    core.Money money23 = new core.Money((-1L), currency22);
    core.Money money24 = new core.Money();
    core.Money money26 = core.Money.dollars(10.0d);
    core.Money money28 = core.Money.dollars(10.0d);
    java.lang.String str29 = money28.toString();
    java.math.BigDecimal bigDecimal30 = money28.amount();
    core.Money money31 = money26.add(money28);
    core.Money money32 = money24.add(money28);
    core.Money money34 = core.Money.dollars(10.0d);
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    java.math.BigDecimal bigDecimal38 = money36.amount();
    core.Money money39 = money34.add(money36);
    core.Money money41 = core.Money.dollars(10.0d);
    java.lang.String str42 = money41.toString();
    java.math.BigDecimal bigDecimal43 = money41.amount();
    core.Money[] money_array45 = money41.divide(10);
    core.Money money46 = money36.subtract(money41);
    core.Money money47 = money28.add(money46);
    core.Money money49 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal50 = money49.amount();
    money49.setAmount((-1.0d));
    core.Money money53 = money47.add(money49);
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    java.math.BigDecimal bigDecimal57 = money55.amount();
    core.Money[] money_array59 = money55.divide(10);
    money55.setAmount(1.0d);
    java.lang.String str62 = money55.toString();
    java.util.Locale locale63 = money55.getLocale();
    core.Money money64 = money53.add(money55);
    core.Money money66 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal67 = money66.amount();
    core.Money[] money_array69 = money66.divide(100);
    core.Money money70 = money64.subtract(money66);
    java.lang.String str71 = money70.toString();
    java.util.Currency currency72 = money70.getCurrency();
    java.math.BigDecimal bigDecimal73 = money70.amount();
    core.Money money74 = money23.subtract(money70);
    java.math.BigDecimal bigDecimal75 = money74.amount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "$10.00"+ "'", str3.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "$10.00"+ "'", str6.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "$10.00"+ "'", str15.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "$10.00"+ "'", str29.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "$10.00"+ "'", str37.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "$10.00"+ "'", str42.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "$10.00"+ "'", str56.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "$1.00"+ "'", str62.equals("$1.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "$0.00"+ "'", str71.equals("$0.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal75);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test42"); }


    core.Money money2 = core.Money.dollars(10.0d);
    java.lang.String str3 = money2.toString();
    java.math.BigDecimal bigDecimal4 = money2.amount();
    java.lang.String str5 = money2.toString();
    core.Money money7 = core.Money.dollars(10.0d);
    java.lang.String str8 = money7.toString();
    java.math.BigDecimal bigDecimal9 = money7.amount();
    java.util.Currency currency10 = money7.getCurrency();
    money2.setCurrency(currency10);
    core.Money money13 = core.Money.dollars(10.0d);
    java.lang.String str14 = money13.toString();
    core.Money money16 = core.Money.dollars(10.0d);
    java.lang.String str17 = money16.toString();
    java.math.BigDecimal bigDecimal18 = money16.amount();
    core.Money[] money_array20 = money16.divide(10);
    boolean b21 = money13.equals((java.lang.Object)money16);
    core.Money money23 = core.Money.dollars(10.0d);
    core.Money money25 = core.Money.dollars(10.0d);
    java.lang.String str26 = money25.toString();
    java.math.BigDecimal bigDecimal27 = money25.amount();
    core.Money money28 = money23.add(money25);
    core.Money money29 = money16.add(money28);
    java.util.Locale locale30 = money29.getLocale();
    core.Money money31 = new core.Money(9.0d, currency10, locale30);
    boolean b33 = money31.equals((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "$10.00"+ "'", str3.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "$10.00"+ "'", str5.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "$10.00"+ "'", str8.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(currency10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "$10.00"+ "'", str14.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "$10.00"+ "'", str17.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "$10.00"+ "'", str26.equals("$10.00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bigDecimal27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(money29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

}
