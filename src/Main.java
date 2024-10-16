public class Main {
    public static void main(String[] args) {

        int apple = 55000;
        byte percent = 90;
        short box = 30000;
        long storage = 8223372036854775808L;
        float appleForVehicles = 2.25f;
        double appleForShips = 8.327777526;


        System.out.println("Значение переменной " + "\"apple\" " + "с типом " + "\"int\" " + "равно " + apple);
        System.out.println("Значение переменной " + "\"percent\" " + "с типом " + "\"byte\" " + "равно " + percent);
        System.out.println("Значение переменной " + "\"box\" " + "с типом " + "\"long\" " + "равно " + box);
        System.out.println("Значение переменной " + "\"storage\" " + "с типом " + "\"int\" " + "равно " + storage);
        System.out.println("Значение переменной " + "\"appleForVehicles\" " + "с типом " + "\"float\" " + "равно " + appleForVehicles);
        System.out.println("Значение переменной " + "\"appleForShips\" " + "с типом " + "\"double\" " + "равно " + appleForShips + "\n");

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("Проверка верной инициализации: " + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n");//Добавил от себя вывод, в задании не указано. Для самопроверки

        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        short totalSheets = 480;
        int sheetsPerStudent = (totalSheets / (classA + classB + classC));
        System.out.println(sheetsPerStudent + "\n");

        byte PerformanceInTwoMinutes = 16;
        short PerformanceInTwentyMinutes = (short) (PerformanceInTwoMinutes * 10);
        short PerformanceInDay = (short) (PerformanceInTwentyMinutes * 3 * 24);
        int PerformanceInThreeDay = (PerformanceInDay * 3);
        int PerformanceInMonth = (PerformanceInThreeDay * 10);

        System.out.println("За 20 минут машина произвела " + PerformanceInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + PerformanceInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + PerformanceInThreeDay + " штук бутылок");
        System.out.println("За 30 дней машина произвела " + PerformanceInMonth + " штук бутылок\n");

        byte cansForSchool = 120;
        byte countClass = (byte) (cansForSchool / 6);
        byte whiteCans = (byte) (countClass * 2);
        byte brownCans = (byte) (countClass * 4);
        System.out.println("В школе, где " + countClass + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски\n");

        byte bananaCount = 5;
        byte bananaWeight = 80;
        short totalWeightBananas = (short) (bananaCount * bananaWeight);
        short milkMM = 200;
        byte milkWeightInHundredMM = 105;
        short totalWeightMilk = (short) (milkMM * milkWeightInHundredMM / 100);
        byte IceCreamCount = 2;
        byte IceCreamWeight = 100;
        short totalWeightIceCream = (short) (IceCreamCount * IceCreamWeight);
        byte rawEggsCount = 4;
        byte OneEggWeight = 70;
        short totalEggsWeight = (short) (rawEggsCount * OneEggWeight);
        short totalGeneralWeightInGrams = (short) (totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalEggsWeight);
        float totalGeneralWeightInKg = 1090 / 1000f;

        System.out.println(totalGeneralWeightInGrams + "гр");
        System.out.println(totalGeneralWeightInKg + "кг\n");

        byte NeedToLoseKG = 7;
        int NeedToLoseGR = (NeedToLoseKG * 1000);
        short losePerDayMin = 250;
        short losePerDayMax = 500;

        int loseWeightOnMin = NeedToLoseGR / losePerDayMin;
        int loseWeightOnMax = NeedToLoseGR / losePerDayMax;
        float loseWeightOnAverage = (float) NeedToLoseGR / (losePerDayMin + losePerDayMax) * 2;

        System.out.println(loseWeightOnMin);
        System.out.println(loseWeightOnMax);
        System.out.println(loseWeightOnAverage + "\n");

        int incomeMashaBefore = 67760;
        int incomeDenisBefore = 83690;
        int incomeKristinaBefore = 76230;

        float increasePercent = 1.10F;

        int incomeMashaAfter = (int) (incomeMashaBefore * increasePercent);
        int incomeDenisAfter = (int) (incomeDenisBefore * increasePercent);
        int incomeKristinaAfter = (int) (incomeKristinaBefore * increasePercent);

        byte MonthInYears = 12;

        int annualIncomeMashaBefore = incomeMashaBefore * MonthInYears;
        int annualIncomeDenisBefore = incomeDenisBefore * MonthInYears;
        int annualIncomeKristinaBefore = incomeKristinaBefore * MonthInYears;

        int annualIncomeMashaAfter = incomeMashaAfter * MonthInYears;
        int annualIncomeDenisAfter = incomeDenisAfter * MonthInYears;
        int annualIncomeKristinaAfter = incomeKristinaAfter * MonthInYears;

        int differenceIncomeMasha = annualIncomeMashaAfter - annualIncomeMashaBefore;
        int differenceIncomeDenis = annualIncomeDenisAfter - annualIncomeDenisBefore;
        int differenceIncomeKristina = annualIncomeKristinaAfter - annualIncomeKristinaBefore;


        var textA = " теперь получает ";
        var textB = " рублей. Годовой доход вырос на ";
        var textC = " рублей";

        System.out.println("Маша" + textA + incomeMashaAfter + textB + differenceIncomeMasha + textC);
        System.out.println("Денис" + textA + incomeDenisAfter + textB + differenceIncomeDenis + textC);
        System.out.println("Кристина" + textA + incomeKristinaAfter + textB + differenceIncomeKristina + textC);


    }
}

