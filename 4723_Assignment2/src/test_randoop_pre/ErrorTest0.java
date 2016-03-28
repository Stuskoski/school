package test_randoop_pre;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal2 = money1.amount();
    core.Money[] money_array4 = money1.divide(100);
    java.util.Currency currency5 = null;
    money1.setCurrency(currency5);
    
    // Checks the contract:  money1.equals(money1)
    org.junit.Assert.assertTrue("Contract failed: money1.equals(money1)", money1.equals(money1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }


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
    core.Money money23 = core.Money.dollars(10.0d);
    java.lang.String str24 = money23.toString();
    java.math.BigDecimal bigDecimal25 = money23.amount();
    java.util.Currency currency26 = money23.getCurrency();
    boolean b27 = money20.equals(money23);
    java.util.Currency currency28 = null;
    money23.setCurrency(currency28);
    
    // Checks the contract:  money23.equals(money23)
    org.junit.Assert.assertTrue("Contract failed: money23.equals(money23)", money23.equals(money23));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }


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
    java.util.Currency currency25 = null;
    money24.setCurrency(currency25);
    
    // Checks the contract:  money24.equals(money24)
    org.junit.Assert.assertTrue("Contract failed: money24.equals(money24)", money24.equals(money24));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }


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
    java.math.BigDecimal bigDecimal18 = money4.amount();
    java.util.Currency currency19 = null;
    money4.setCurrency(currency19);
    
    // Checks the contract:  money4.equals(money4)
    org.junit.Assert.assertTrue("Contract failed: money4.equals(money4)", money4.equals(money4));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }


    core.Money money0 = new core.Money();
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
    core.Money money23 = new core.Money(1L, currency19);
    core.Money money25 = core.Money.dollars(10.0d);
    java.lang.String str26 = money25.toString();
    java.math.BigDecimal bigDecimal27 = money25.amount();
    core.Money[] money_array29 = money25.divide(1);
    boolean b31 = money25.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale32 = money25.getLocale();
    core.Money money34 = core.Money.dollars(10.0d);
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    java.math.BigDecimal bigDecimal38 = money36.amount();
    core.Money money39 = money34.add(money36);
    core.Money money40 = money25.subtract(money34);
    core.Money money42 = core.Money.dollars(10.0d);
    java.lang.String str43 = money42.toString();
    java.math.BigDecimal bigDecimal44 = money42.amount();
    java.lang.String str45 = money42.toString();
    core.Money money47 = core.Money.dollars(10.0d);
    java.lang.String str48 = money47.toString();
    java.math.BigDecimal bigDecimal49 = money47.amount();
    java.util.Currency currency50 = money47.getCurrency();
    money42.setCurrency(currency50);
    money34.setCurrency(currency50);
    core.Money money56 = core.Money.dollars(10.0d);
    java.lang.String str57 = money56.toString();
    java.math.BigDecimal bigDecimal58 = money56.amount();
    java.lang.String str59 = money56.toString();
    core.Money money61 = core.Money.dollars(10.0d);
    java.lang.String str62 = money61.toString();
    java.math.BigDecimal bigDecimal63 = money61.amount();
    java.util.Currency currency64 = money61.getCurrency();
    money56.setCurrency(currency64);
    core.Money money67 = core.Money.dollars(10.0d);
    core.Money money69 = core.Money.dollars(10.0d);
    core.Money money71 = core.Money.dollars(10.0d);
    java.lang.String str72 = money71.toString();
    java.math.BigDecimal bigDecimal73 = money71.amount();
    core.Money money74 = money69.add(money71);
    core.Money money75 = money67.subtract(money69);
    core.Money money77 = core.Money.dollars(10.0d);
    java.lang.String str78 = money77.toString();
    java.math.BigDecimal bigDecimal79 = money77.amount();
    core.Money[] money_array81 = money77.divide(1);
    boolean b83 = money77.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale84 = money77.getLocale();
    money69.setLocale(locale84);
    core.Money money86 = new core.Money(100.0d, currency64, locale84);
    core.Money money87 = new core.Money(100L, currency64);
    core.Money money88 = money34.add(money87);
    money34.setAmount(100.0d);
    java.util.Locale locale91 = money34.getLocale();
    core.Money money92 = new core.Money(100.0d, currency19, locale91);
    core.Money money93 = new core.Money(10.0d, currency19);
    core.Money money94 = new core.Money(0L, currency19);
    boolean b95 = money0.equals((java.lang.Object)money94);
    java.util.Currency currency96 = null;
    money94.setCurrency(currency96);
    
    // Checks the contract:  money94.equals(money94)
    org.junit.Assert.assertTrue("Contract failed: money94.equals(money94)", money94.equals(money94));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }


    core.Money money1 = core.Money.dollars(11.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    java.lang.String str4 = money3.toString();
    core.Money money6 = core.Money.dollars(10.0d);
    java.lang.String str7 = money6.toString();
    java.math.BigDecimal bigDecimal8 = money6.amount();
    core.Money[] money_array10 = money6.divide(10);
    boolean b11 = money3.equals((java.lang.Object)money6);
    core.Money money13 = core.Money.dollars(10.0d);
    core.Money money15 = core.Money.dollars(10.0d);
    java.lang.String str16 = money15.toString();
    java.math.BigDecimal bigDecimal17 = money15.amount();
    core.Money money18 = money13.add(money15);
    core.Money money20 = core.Money.dollars(10.0d);
    java.lang.String str21 = money20.toString();
    java.math.BigDecimal bigDecimal22 = money20.amount();
    core.Money[] money_array24 = money20.divide(10);
    core.Money money25 = money15.subtract(money20);
    core.Money money26 = money6.add(money25);
    core.Money money30 = core.Money.dollars(10.0d);
    java.lang.String str31 = money30.toString();
    java.math.BigDecimal bigDecimal32 = money30.amount();
    core.Money[] money_array34 = money30.divide(1);
    boolean b36 = money30.equals((java.lang.Object)(-1.0d));
    core.Money money38 = core.Money.dollars(10.0d);
    java.lang.String str39 = money38.toString();
    java.math.BigDecimal bigDecimal40 = money38.amount();
    java.util.Currency currency41 = money38.getCurrency();
    money30.setCurrency(currency41);
    core.Money money43 = new core.Money(10.0d, currency41);
    core.Money money44 = new core.Money(1.0d, currency41);
    money25.setCurrency(currency41);
    money25.setAmount(1.0d);
    boolean b48 = money1.equals((java.lang.Object)money25);
    money25.setAmount(100.0d);
    java.util.Currency currency51 = null;
    money25.setCurrency(currency51);
    
    // Checks the contract:  money25.equals(money25)
    org.junit.Assert.assertTrue("Contract failed: money25.equals(money25)", money25.equals(money25));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }


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
    java.util.Currency currency41 = null;
    money39.setCurrency(currency41);
    
    // Checks the contract:  money39.equals(money39)
    org.junit.Assert.assertTrue("Contract failed: money39.equals(money39)", money39.equals(money39));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }


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
    core.Money money16 = core.Money.dollars(10.0d);
    java.lang.String str17 = money16.toString();
    java.math.BigDecimal bigDecimal18 = money16.amount();
    core.Money[] money_array20 = money16.divide(1);
    boolean b22 = money16.equals((java.lang.Object)(-1.0d));
    core.Money money24 = core.Money.dollars(10.0d);
    java.lang.String str25 = money24.toString();
    java.math.BigDecimal bigDecimal26 = money24.amount();
    java.util.Currency currency27 = money24.getCurrency();
    money16.setCurrency(currency27);
    core.Money money29 = new core.Money(10.0d, currency27);
    java.lang.String str30 = money29.toString();
    core.Money money32 = core.Money.dollars(10.0d);
    core.Money money34 = core.Money.dollars(10.0d);
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    java.math.BigDecimal bigDecimal38 = money36.amount();
    core.Money money39 = money34.add(money36);
    core.Money money40 = money32.subtract(money34);
    java.lang.String str41 = money34.toString();
    core.Money money42 = money29.add(money34);
    core.Money money43 = money8.add(money29);
    core.Money money45 = core.Money.dollars(10.0d);
    java.math.BigDecimal bigDecimal46 = money45.amount();
    core.Money money48 = core.Money.dollars(10.0d);
    java.lang.String str49 = money48.toString();
    core.Money money51 = core.Money.dollars(10.0d);
    java.lang.String str52 = money51.toString();
    java.math.BigDecimal bigDecimal53 = money51.amount();
    core.Money[] money_array55 = money51.divide(10);
    boolean b56 = money48.equals((java.lang.Object)money51);
    money51.setAmount(100.0d);
    boolean b59 = money45.equals(money51);
    core.Money money60 = money29.subtract(money51);
    java.util.Currency currency61 = null;
    money60.setCurrency(currency61);
    
    // Checks the contract:  money60.equals(money60)
    org.junit.Assert.assertTrue("Contract failed: money60.equals(money60)", money60.equals(money60));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }


    core.Money money1 = core.Money.dollars(10.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    java.lang.String str4 = money3.toString();
    java.math.BigDecimal bigDecimal5 = money3.amount();
    core.Money money6 = money1.add(money3);
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
    core.Money money26 = new core.Money(10.0d, currency24);
    core.Money money27 = new core.Money(1.0d, currency24);
    core.Money money28 = new core.Money(1L, currency24);
    core.Money money29 = new core.Money(10.0d, currency24);
    core.Money money30 = new core.Money(100.0d, currency24);
    core.Money money31 = money3.subtract(money30);
    java.util.Currency currency32 = null;
    money31.setCurrency(currency32);
    
    // Checks the contract:  money31.equals(money31)
    org.junit.Assert.assertTrue("Contract failed: money31.equals(money31)", money31.equals(money31));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }


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
    java.math.BigDecimal bigDecimal22 = money21.amount();
    java.util.Currency currency23 = null;
    money21.setCurrency(currency23);
    
    // Checks the contract:  money21.equals(money21)
    org.junit.Assert.assertTrue("Contract failed: money21.equals(money21)", money21.equals(money21));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }


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
    java.util.Currency currency25 = money5.getCurrency();
    core.Money money26 = new core.Money(100L, currency25);
    java.util.Currency currency27 = null;
    money26.setCurrency(currency27);
    
    // Checks the contract:  money26.equals(money26)
    org.junit.Assert.assertTrue("Contract failed: money26.equals(money26)", money26.equals(money26));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }


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
    java.util.Currency currency17 = money16.getCurrency();
    core.Money money21 = core.Money.dollars(10.0d);
    java.lang.String str22 = money21.toString();
    java.math.BigDecimal bigDecimal23 = money21.amount();
    core.Money[] money_array25 = money21.divide(10);
    money21.setAmount(1.0d);
    java.lang.String str28 = money21.toString();
    core.Money money31 = core.Money.dollars(10.0d);
    java.lang.String str32 = money31.toString();
    java.math.BigDecimal bigDecimal33 = money31.amount();
    core.Money[] money_array35 = money31.divide(1);
    boolean b37 = money31.equals((java.lang.Object)(-1.0d));
    core.Money money39 = core.Money.dollars(10.0d);
    java.lang.String str40 = money39.toString();
    java.math.BigDecimal bigDecimal41 = money39.amount();
    java.util.Currency currency42 = money39.getCurrency();
    money31.setCurrency(currency42);
    core.Money money45 = core.Money.dollars(10.0d);
    java.lang.String str46 = money45.toString();
    java.math.BigDecimal bigDecimal47 = money45.amount();
    core.Money[] money_array49 = money45.divide(1);
    boolean b51 = money45.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale52 = money45.getLocale();
    core.Money money53 = new core.Money(1.0d, currency42, locale52);
    money21.setCurrency(currency42);
    core.Money money56 = core.Money.dollars(10.0d);
    core.Money money58 = core.Money.dollars(10.0d);
    core.Money money60 = core.Money.dollars(10.0d);
    java.lang.String str61 = money60.toString();
    java.math.BigDecimal bigDecimal62 = money60.amount();
    core.Money money63 = money58.add(money60);
    core.Money money64 = money56.subtract(money58);
    core.Money money66 = core.Money.dollars(10.0d);
    java.lang.String str67 = money66.toString();
    java.math.BigDecimal bigDecimal68 = money66.amount();
    core.Money[] money_array70 = money66.divide(1);
    boolean b72 = money66.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale73 = money66.getLocale();
    money58.setLocale(locale73);
    core.Money money75 = new core.Money(1.0d, currency42, locale73);
    core.Money money76 = new core.Money(0.0d, currency42);
    core.Money money79 = core.Money.dollars(10.0d);
    java.lang.String str80 = money79.toString();
    java.math.BigDecimal bigDecimal81 = money79.amount();
    core.Money[] money_array83 = money79.divide(1);
    boolean b85 = money79.equals((java.lang.Object)(-1.0d));
    core.Money money87 = core.Money.dollars(10.0d);
    java.lang.String str88 = money87.toString();
    java.math.BigDecimal bigDecimal89 = money87.amount();
    java.util.Currency currency90 = money87.getCurrency();
    money79.setCurrency(currency90);
    core.Money money92 = new core.Money(10.0d, currency90);
    money76.setCurrency(currency90);
    core.Money money94 = money16.subtract(money76);
    java.util.Currency currency95 = null;
    money76.setCurrency(currency95);
    
    // Checks the contract:  money76.equals(money76)
    org.junit.Assert.assertTrue("Contract failed: money76.equals(money76)", money76.equals(money76));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }


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
    core.Money money24 = money17.subtract(money19);
    money24.setAmount(11.0d);
    core.Money money28 = core.Money.dollars(10.0d);
    core.Money money30 = core.Money.dollars(10.0d);
    core.Money money32 = core.Money.dollars(10.0d);
    java.lang.String str33 = money32.toString();
    java.math.BigDecimal bigDecimal34 = money32.amount();
    core.Money money35 = money30.add(money32);
    core.Money money36 = money28.subtract(money30);
    java.lang.String str37 = money30.toString();
    core.Money money39 = core.Money.dollars(10.0d);
    core.Money money41 = core.Money.dollars(10.0d);
    core.Money money43 = core.Money.dollars(10.0d);
    java.lang.String str44 = money43.toString();
    java.math.BigDecimal bigDecimal45 = money43.amount();
    core.Money money46 = money41.add(money43);
    core.Money money47 = money39.subtract(money41);
    core.Money money48 = money30.add(money47);
    java.util.Currency currency49 = money47.getCurrency();
    core.Money money51 = core.Money.dollars(10.0d);
    core.Money money53 = core.Money.dollars(10.0d);
    core.Money money55 = core.Money.dollars(10.0d);
    java.lang.String str56 = money55.toString();
    java.math.BigDecimal bigDecimal57 = money55.amount();
    core.Money money58 = money53.add(money55);
    core.Money money59 = money51.subtract(money53);
    java.lang.String str60 = money53.toString();
    core.Money money62 = core.Money.dollars(10.0d);
    core.Money money64 = core.Money.dollars(10.0d);
    core.Money money66 = core.Money.dollars(10.0d);
    java.lang.String str67 = money66.toString();
    java.math.BigDecimal bigDecimal68 = money66.amount();
    core.Money money69 = money64.add(money66);
    core.Money money70 = money62.subtract(money64);
    core.Money money71 = money53.add(money70);
    core.Money money73 = core.Money.dollars(10.0d);
    java.lang.String str74 = money73.toString();
    java.math.BigDecimal bigDecimal75 = money73.amount();
    java.util.Currency currency76 = money73.getCurrency();
    boolean b77 = money70.equals(money73);
    java.util.Currency currency78 = money70.getCurrency();
    core.Money money79 = money47.add(money70);
    core.Money money80 = money24.subtract(money79);
    java.util.Currency currency81 = null;
    money80.setCurrency(currency81);
    
    // Checks the contract:  money80.equals(money80)
    org.junit.Assert.assertTrue("Contract failed: money80.equals(money80)", money80.equals(money80));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }


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
    java.lang.String str26 = money25.toString();
    java.math.BigDecimal bigDecimal27 = money25.amount();
    core.Money[] money_array29 = money25.divide(1);
    boolean b31 = money25.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale32 = money25.getLocale();
    core.Money money34 = core.Money.dollars(10.0d);
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    java.math.BigDecimal bigDecimal38 = money36.amount();
    core.Money money39 = money34.add(money36);
    core.Money money40 = money25.subtract(money34);
    core.Money money42 = core.Money.dollars(10.0d);
    java.lang.String str43 = money42.toString();
    java.math.BigDecimal bigDecimal44 = money42.amount();
    java.lang.String str45 = money42.toString();
    core.Money money47 = core.Money.dollars(10.0d);
    java.lang.String str48 = money47.toString();
    java.math.BigDecimal bigDecimal49 = money47.amount();
    java.util.Currency currency50 = money47.getCurrency();
    money42.setCurrency(currency50);
    money34.setCurrency(currency50);
    core.Money money56 = core.Money.dollars(10.0d);
    java.lang.String str57 = money56.toString();
    java.math.BigDecimal bigDecimal58 = money56.amount();
    java.lang.String str59 = money56.toString();
    core.Money money61 = core.Money.dollars(10.0d);
    java.lang.String str62 = money61.toString();
    java.math.BigDecimal bigDecimal63 = money61.amount();
    java.util.Currency currency64 = money61.getCurrency();
    money56.setCurrency(currency64);
    core.Money money67 = core.Money.dollars(10.0d);
    core.Money money69 = core.Money.dollars(10.0d);
    core.Money money71 = core.Money.dollars(10.0d);
    java.lang.String str72 = money71.toString();
    java.math.BigDecimal bigDecimal73 = money71.amount();
    core.Money money74 = money69.add(money71);
    core.Money money75 = money67.subtract(money69);
    core.Money money77 = core.Money.dollars(10.0d);
    java.lang.String str78 = money77.toString();
    java.math.BigDecimal bigDecimal79 = money77.amount();
    core.Money[] money_array81 = money77.divide(1);
    boolean b83 = money77.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale84 = money77.getLocale();
    money69.setLocale(locale84);
    core.Money money86 = new core.Money(100.0d, currency64, locale84);
    core.Money money87 = new core.Money(100L, currency64);
    core.Money money88 = money34.add(money87);
    money34.setAmount(100.0d);
    boolean b91 = money23.equals(money34);
    java.util.Currency currency92 = null;
    money23.setCurrency(currency92);
    
    // Checks the contract:  money23.equals(money23)
    org.junit.Assert.assertTrue("Contract failed: money23.equals(money23)", money23.equals(money23));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }


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
    java.math.BigDecimal bigDecimal33 = money31.amount();
    core.Money[] money_array35 = money31.divide(10);
    money31.setAmount(1.0d);
    java.lang.String str38 = money31.toString();
    java.util.Locale locale39 = money31.getLocale();
    core.Money money40 = money29.add(money31);
    core.Money money42 = core.Money.dollars(10.0d);
    java.lang.String str43 = money42.toString();
    java.math.BigDecimal bigDecimal44 = money42.amount();
    core.Money[] money_array46 = money42.divide(1);
    boolean b48 = money42.equals((java.lang.Object)(-1.0d));
    core.Money money50 = core.Money.dollars(10.0d);
    java.lang.String str51 = money50.toString();
    java.math.BigDecimal bigDecimal52 = money50.amount();
    java.util.Currency currency53 = money50.getCurrency();
    money42.setCurrency(currency53);
    core.Money money56 = core.Money.dollars(10.0d);
    java.lang.String str57 = money56.toString();
    java.math.BigDecimal bigDecimal58 = money56.amount();
    core.Money[] money_array60 = money56.divide(1);
    boolean b62 = money56.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale63 = money56.getLocale();
    core.Money money65 = core.Money.dollars(10.0d);
    core.Money money67 = core.Money.dollars(10.0d);
    java.lang.String str68 = money67.toString();
    java.math.BigDecimal bigDecimal69 = money67.amount();
    core.Money money70 = money65.add(money67);
    core.Money money71 = money56.subtract(money65);
    core.Money money72 = money42.add(money71);
    money71.setAmount(100.0d);
    boolean b75 = money31.equals((java.lang.Object)money71);
    java.util.Currency currency76 = null;
    money71.setCurrency(currency76);
    
    // Checks the contract:  money71.equals(money71)
    org.junit.Assert.assertTrue("Contract failed: money71.equals(money71)", money71.equals(money71));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }


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
    core.Money money21 = core.Money.dollars(10.0d);
    java.lang.String str22 = money21.toString();
    java.math.BigDecimal bigDecimal23 = money21.amount();
    core.Money[] money_array25 = money21.divide(10);
    boolean b26 = money18.equals((java.lang.Object)money21);
    core.Money money28 = core.Money.dollars(10.0d);
    core.Money money30 = core.Money.dollars(10.0d);
    java.lang.String str31 = money30.toString();
    java.math.BigDecimal bigDecimal32 = money30.amount();
    core.Money money33 = money28.add(money30);
    core.Money money34 = money21.add(money33);
    core.Money money36 = core.Money.dollars(10.0d);
    java.lang.String str37 = money36.toString();
    java.lang.String str38 = money36.toString();
    money36.setAmount(0.0d);
    core.Money money41 = money21.add(money36);
    core.Money money42 = money16.add(money36);
    money16.setAmount((-1.0d));
    core.Money money48 = core.Money.dollars(10.0d);
    java.lang.String str49 = money48.toString();
    java.math.BigDecimal bigDecimal50 = money48.amount();
    java.lang.String str51 = money48.toString();
    core.Money money53 = core.Money.dollars(10.0d);
    java.lang.String str54 = money53.toString();
    java.math.BigDecimal bigDecimal55 = money53.amount();
    java.util.Currency currency56 = money53.getCurrency();
    money48.setCurrency(currency56);
    core.Money money59 = core.Money.dollars(10.0d);
    core.Money money61 = core.Money.dollars(10.0d);
    core.Money money63 = core.Money.dollars(10.0d);
    java.lang.String str64 = money63.toString();
    java.math.BigDecimal bigDecimal65 = money63.amount();
    core.Money money66 = money61.add(money63);
    core.Money money67 = money59.subtract(money61);
    core.Money money69 = core.Money.dollars(10.0d);
    java.lang.String str70 = money69.toString();
    java.math.BigDecimal bigDecimal71 = money69.amount();
    core.Money[] money_array73 = money69.divide(1);
    boolean b75 = money69.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale76 = money69.getLocale();
    money61.setLocale(locale76);
    core.Money money78 = new core.Money(100.0d, currency56, locale76);
    core.Money money79 = new core.Money(100L, currency56);
    java.util.Locale locale80 = money79.getLocale();
    boolean b81 = money16.equals((java.lang.Object)locale80);
    money16.setAmount(10.0d);
    java.util.Currency currency84 = null;
    money16.setCurrency(currency84);
    
    // Checks the contract:  money16.equals(money16)
    org.junit.Assert.assertTrue("Contract failed: money16.equals(money16)", money16.equals(money16));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }


    core.Money money2 = core.Money.dollars(10.0d);
    java.lang.String str3 = money2.toString();
    java.math.BigDecimal bigDecimal4 = money2.amount();
    core.Money[] money_array6 = money2.divide(10);
    money2.setAmount(1.0d);
    java.lang.String str9 = money2.toString();
    money2.setAmount(10.0d);
    core.Money[] money_array13 = money2.divide(10);
    java.util.Currency currency14 = money2.getCurrency();
    core.Money money21 = core.Money.dollars(10.0d);
    java.lang.String str22 = money21.toString();
    java.math.BigDecimal bigDecimal23 = money21.amount();
    core.Money[] money_array25 = money21.divide(1);
    boolean b27 = money21.equals((java.lang.Object)(-1.0d));
    core.Money money29 = core.Money.dollars(10.0d);
    java.lang.String str30 = money29.toString();
    java.math.BigDecimal bigDecimal31 = money29.amount();
    java.util.Currency currency32 = money29.getCurrency();
    money21.setCurrency(currency32);
    core.Money money34 = new core.Money(10.0d, currency32);
    core.Money money35 = new core.Money(1.0d, currency32);
    core.Money money36 = new core.Money(10.0d, currency32);
    core.Money money37 = new core.Money(100L, currency32);
    core.Money money41 = core.Money.dollars(10.0d);
    java.lang.String str42 = money41.toString();
    java.math.BigDecimal bigDecimal43 = money41.amount();
    core.Money[] money_array45 = money41.divide(10);
    money41.setAmount(1.0d);
    java.lang.String str48 = money41.toString();
    core.Money money51 = core.Money.dollars(10.0d);
    java.lang.String str52 = money51.toString();
    java.math.BigDecimal bigDecimal53 = money51.amount();
    core.Money[] money_array55 = money51.divide(1);
    boolean b57 = money51.equals((java.lang.Object)(-1.0d));
    core.Money money59 = core.Money.dollars(10.0d);
    java.lang.String str60 = money59.toString();
    java.math.BigDecimal bigDecimal61 = money59.amount();
    java.util.Currency currency62 = money59.getCurrency();
    money51.setCurrency(currency62);
    core.Money money65 = core.Money.dollars(10.0d);
    java.lang.String str66 = money65.toString();
    java.math.BigDecimal bigDecimal67 = money65.amount();
    core.Money[] money_array69 = money65.divide(1);
    boolean b71 = money65.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale72 = money65.getLocale();
    core.Money money73 = new core.Money(1.0d, currency62, locale72);
    money41.setCurrency(currency62);
    core.Money money75 = new core.Money(1L, currency62);
    core.Money money77 = core.Money.dollars(10.0d);
    core.Money money79 = core.Money.dollars(10.0d);
    java.lang.String str80 = money79.toString();
    java.math.BigDecimal bigDecimal81 = money79.amount();
    core.Money[] money_array83 = money79.divide(1);
    boolean b85 = money79.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale86 = money79.getLocale();
    money77.setLocale(locale86);
    core.Money money88 = new core.Money(10.0d, currency62, locale86);
    core.Money[] money_array90 = money88.divide(10);
    java.util.Locale locale91 = money88.getLocale();
    core.Money money92 = new core.Money(0.0d, currency32, locale91);
    core.Money money93 = new core.Money(100.0d, currency14, locale91);
    java.util.Currency currency94 = null;
    money93.setCurrency(currency94);
    
    // Checks the contract:  money93.equals(money93)
    org.junit.Assert.assertTrue("Contract failed: money93.equals(money93)", money93.equals(money93));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }


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
    core.Money[] money_array27 = money20.divide(1);
    core.Money[] money_array29 = money20.divide(1);
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
    core.Money money49 = core.Money.dollars(10.0d);
    java.lang.String str50 = money49.toString();
    java.math.BigDecimal bigDecimal51 = money49.amount();
    core.Money[] money_array53 = money49.divide(10);
    core.Money money54 = money44.subtract(money49);
    core.Money money55 = money35.add(money54);
    core.Money money59 = core.Money.dollars(10.0d);
    java.lang.String str60 = money59.toString();
    java.math.BigDecimal bigDecimal61 = money59.amount();
    core.Money[] money_array63 = money59.divide(1);
    boolean b65 = money59.equals((java.lang.Object)(-1.0d));
    core.Money money67 = core.Money.dollars(10.0d);
    java.lang.String str68 = money67.toString();
    java.math.BigDecimal bigDecimal69 = money67.amount();
    java.util.Currency currency70 = money67.getCurrency();
    money59.setCurrency(currency70);
    core.Money money72 = new core.Money(10.0d, currency70);
    core.Money money73 = new core.Money(1.0d, currency70);
    money54.setCurrency(currency70);
    core.Money money77 = core.Money.dollars(10.0d);
    java.lang.String str78 = money77.toString();
    java.math.BigDecimal bigDecimal79 = money77.amount();
    java.lang.String str80 = money77.toString();
    core.Money money82 = core.Money.dollars(10.0d);
    java.lang.String str83 = money82.toString();
    java.math.BigDecimal bigDecimal84 = money82.amount();
    java.util.Currency currency85 = money82.getCurrency();
    money77.setCurrency(currency85);
    core.Money money87 = new core.Money(0.0d, currency85);
    java.util.Locale locale88 = money87.getLocale();
    core.Money money89 = new core.Money(100.0d, currency70, locale88);
    money20.setCurrency(currency70);
    core.Money money91 = new core.Money(100L, currency70);
    java.util.Currency currency92 = null;
    money91.setCurrency(currency92);
    
    // Checks the contract:  money91.equals(money91)
    org.junit.Assert.assertTrue("Contract failed: money91.equals(money91)", money91.equals(money91));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }


    core.Money money1 = core.Money.dollars(10.0d);
    java.lang.String str2 = money1.toString();
    java.math.BigDecimal bigDecimal3 = money1.amount();
    java.lang.String str4 = money1.toString();
    core.Money money5 = new core.Money();
    core.Money money7 = core.Money.dollars(10.0d);
    core.Money money9 = core.Money.dollars(10.0d);
    java.lang.String str10 = money9.toString();
    java.math.BigDecimal bigDecimal11 = money9.amount();
    core.Money money12 = money7.add(money9);
    core.Money money13 = money5.add(money9);
    core.Money money15 = core.Money.dollars(10.0d);
    core.Money money17 = core.Money.dollars(10.0d);
    java.lang.String str18 = money17.toString();
    java.math.BigDecimal bigDecimal19 = money17.amount();
    core.Money money20 = money15.add(money17);
    core.Money money22 = core.Money.dollars(10.0d);
    java.lang.String str23 = money22.toString();
    java.math.BigDecimal bigDecimal24 = money22.amount();
    core.Money[] money_array26 = money22.divide(10);
    core.Money money27 = money17.subtract(money22);
    core.Money money28 = money9.add(money27);
    java.util.Currency currency29 = money9.getCurrency();
    core.Money money30 = money1.subtract(money9);
    core.Money money31 = new core.Money();
    core.Money money33 = core.Money.dollars(10.0d);
    core.Money money35 = core.Money.dollars(10.0d);
    java.lang.String str36 = money35.toString();
    java.math.BigDecimal bigDecimal37 = money35.amount();
    core.Money money38 = money33.add(money35);
    core.Money money39 = money31.add(money35);
    java.util.Locale locale40 = money39.getLocale();
    money1.setLocale(locale40);
    java.util.Currency currency42 = null;
    money1.setCurrency(currency42);
    
    // Checks the contract:  money1.equals(money1)
    org.junit.Assert.assertTrue("Contract failed: money1.equals(money1)", money1.equals(money1));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }


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
    java.util.Locale locale71 = money12.getLocale();
    core.Money money72 = new core.Money();
    core.Money money74 = core.Money.dollars(10.0d);
    core.Money money76 = core.Money.dollars(10.0d);
    java.lang.String str77 = money76.toString();
    java.math.BigDecimal bigDecimal78 = money76.amount();
    core.Money money79 = money74.add(money76);
    core.Money money80 = money72.add(money76);
    core.Money money82 = core.Money.dollars(10.0d);
    core.Money money84 = core.Money.dollars(10.0d);
    java.lang.String str85 = money84.toString();
    java.math.BigDecimal bigDecimal86 = money84.amount();
    core.Money money87 = money82.add(money84);
    boolean b88 = money80.equals(money84);
    java.util.Locale locale89 = money80.getLocale();
    money12.setLocale(locale89);
    java.util.Currency currency91 = null;
    money12.setCurrency(currency91);
    
    // Checks the contract:  money12.equals(money12)
    org.junit.Assert.assertTrue("Contract failed: money12.equals(money12)", money12.equals(money12));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }


    core.Money money1 = core.Money.dollars(10.0d);
    core.Money money3 = core.Money.dollars(10.0d);
    core.Money money5 = core.Money.dollars(10.0d);
    java.lang.String str6 = money5.toString();
    java.math.BigDecimal bigDecimal7 = money5.amount();
    core.Money money8 = money3.add(money5);
    core.Money money9 = money1.subtract(money3);
    money9.setAmount(100.0d);
    core.Money money18 = core.Money.dollars(10.0d);
    java.lang.String str19 = money18.toString();
    java.math.BigDecimal bigDecimal20 = money18.amount();
    core.Money[] money_array22 = money18.divide(1);
    boolean b24 = money18.equals((java.lang.Object)(-1.0d));
    core.Money money26 = core.Money.dollars(10.0d);
    java.lang.String str27 = money26.toString();
    java.math.BigDecimal bigDecimal28 = money26.amount();
    java.util.Currency currency29 = money26.getCurrency();
    money18.setCurrency(currency29);
    core.Money money31 = new core.Money(10.0d, currency29);
    core.Money money32 = new core.Money(1.0d, currency29);
    core.Money money33 = new core.Money(0L, currency29);
    core.Money money37 = core.Money.dollars(10.0d);
    java.lang.String str38 = money37.toString();
    java.math.BigDecimal bigDecimal39 = money37.amount();
    core.Money[] money_array41 = money37.divide(1);
    boolean b43 = money37.equals((java.lang.Object)(-1.0d));
    core.Money money45 = core.Money.dollars(10.0d);
    java.lang.String str46 = money45.toString();
    java.math.BigDecimal bigDecimal47 = money45.amount();
    java.util.Currency currency48 = money45.getCurrency();
    money37.setCurrency(currency48);
    core.Money money51 = core.Money.dollars(10.0d);
    java.lang.String str52 = money51.toString();
    java.math.BigDecimal bigDecimal53 = money51.amount();
    core.Money[] money_array55 = money51.divide(1);
    boolean b57 = money51.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale58 = money51.getLocale();
    core.Money money59 = new core.Money(1.0d, currency48, locale58);
    core.Money money61 = core.Money.dollars(10.0d);
    core.Money money63 = core.Money.dollars(10.0d);
    java.lang.String str64 = money63.toString();
    java.math.BigDecimal bigDecimal65 = money63.amount();
    core.Money[] money_array67 = money63.divide(1);
    boolean b69 = money63.equals((java.lang.Object)(-1.0d));
    java.util.Locale locale70 = money63.getLocale();
    money61.setLocale(locale70);
    core.Money money72 = new core.Money(1.0d, currency48, locale70);
    core.Money money73 = new core.Money(0.0d, currency29, locale70);
    java.util.Locale locale74 = money73.getLocale();
    money73.setAmount(100.0d);
    java.util.Currency currency77 = money73.getCurrency();
    core.Money money78 = new core.Money(0.0d, currency77);
    money78.setAmount(0.0d);
    boolean b81 = money9.equals((java.lang.Object)money78);
    java.util.Currency currency82 = null;
    money78.setCurrency(currency82);
    
    // Checks the contract:  money78.equals(money78)
    org.junit.Assert.assertTrue("Contract failed: money78.equals(money78)", money78.equals(money78));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }


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
    java.lang.String str14 = money8.toString();
    core.Money money16 = core.Money.dollars(10.0d);
    java.lang.String str17 = money16.toString();
    java.math.BigDecimal bigDecimal18 = money16.amount();
    java.util.Currency currency19 = money16.getCurrency();
    core.Money money24 = core.Money.dollars(10.0d);
    java.lang.String str25 = money24.toString();
    java.math.BigDecimal bigDecimal26 = money24.amount();
    core.Money[] money_array28 = money24.divide(1);
    boolean b30 = money24.equals((java.lang.Object)(-1.0d));
    core.Money money32 = core.Money.dollars(10.0d);
    java.lang.String str33 = money32.toString();
    java.math.BigDecimal bigDecimal34 = money32.amount();
    java.util.Currency currency35 = money32.getCurrency();
    money24.setCurrency(currency35);
    core.Money money37 = new core.Money(10.0d, currency35);
    core.Money money38 = new core.Money(1.0d, currency35);
    core.Money money39 = new core.Money(0L, currency35);
    core.Money money40 = money16.subtract(money39);
    boolean b41 = money8.equals(money16);
    core.Money money43 = core.Money.dollars(10.0d);
    java.lang.String str44 = money43.toString();
    core.Money money46 = core.Money.dollars(10.0d);
    java.lang.String str47 = money46.toString();
    java.math.BigDecimal bigDecimal48 = money46.amount();
    core.Money[] money_array50 = money46.divide(10);
    boolean b51 = money43.equals((java.lang.Object)money46);
    core.Money[] money_array53 = money46.divide(10);
    boolean b54 = money16.equals((java.lang.Object)10);
    core.Money money55 = new core.Money();
    core.Money money57 = core.Money.dollars(10.0d);
    core.Money money59 = core.Money.dollars(10.0d);
    java.lang.String str60 = money59.toString();
    java.math.BigDecimal bigDecimal61 = money59.amount();
    core.Money money62 = money57.add(money59);
    core.Money money63 = money55.add(money59);
    core.Money money65 = core.Money.dollars(10.0d);
    core.Money money67 = core.Money.dollars(10.0d);
    java.lang.String str68 = money67.toString();
    java.math.BigDecimal bigDecimal69 = money67.amount();
    core.Money money70 = money65.add(money67);
    core.Money money72 = core.Money.dollars(10.0d);
    java.lang.String str73 = money72.toString();
    java.math.BigDecimal bigDecimal74 = money72.amount();
    core.Money[] money_array76 = money72.divide(10);
    core.Money money77 = money67.subtract(money72);
    core.Money money78 = money59.add(money77);
    java.util.Currency currency79 = money59.getCurrency();
    boolean b80 = money16.equals(money59);
    money16.setAmount(71.0d);
    money16.setAmount(2.0d);
    java.util.Currency currency85 = null;
    money16.setCurrency(currency85);
    
    // Checks the contract:  money16.equals(money16)
    org.junit.Assert.assertTrue("Contract failed: money16.equals(money16)", money16.equals(money16));

  }

}
