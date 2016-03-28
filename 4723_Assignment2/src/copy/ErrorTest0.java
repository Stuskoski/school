package test_randoop_pre;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.Money;

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

}
