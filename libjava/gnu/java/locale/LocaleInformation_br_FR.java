// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_br_FR extends ListResourceBundle
{
  static final String decimalSeparator = ",";
  static final String groupingSeparator = "";
  static final String numberFormat = "#.###";
  static final String percentFormat = "#%";
  static final String[] weekdays = { null, "sul", "lun", "meurzh", "merc'her", "yaou", "gwener", "sadorn" };

  static final String[] shortWeekdays = { null, "sul", "lun", "meu", "mer", "yao", "gwe", "sad" };

  static final String[] shortMonths = { "Gen ", "C'hw", "Meu ", "Ebr ", "Mae ", "Eve ", "Gou ", "Eos ", "Gwe ", "Her ", "Du  ", "Ker ", null };

  static final String[] months = { "Genver", "C'hwevrer", "Meurzh", "Ebrel", "Mae", "Mezheven", "Gouere", "Eost", "Gwengolo", "Here", "Du", "Kerzu", null };

  static final String[] ampms = { " ", " " };

  static final String shortDateFormat = "dd.MM.yyyy";
  static final String defaultTimeFormat = "hhem:s a";
  static final String currencySymbol = "F";
  static final String intlCurrencySymbol = "FRF";
  static final String currencyFormat = "#,###,##0.00 $;-#,###,##0.00 $";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "shortDateFormat", shortDateFormat },
    { "defaultTimeFormat", defaultTimeFormat },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
    { "currencyFormat", currencyFormat },
    { "decimalSeparator", decimalSeparator },
    { "groupingSeparator", groupingSeparator },
    { "numberFormat", numberFormat },
    { "percentFormat", percentFormat },
  };

  public Object[][] getContents () { return contents; }
}