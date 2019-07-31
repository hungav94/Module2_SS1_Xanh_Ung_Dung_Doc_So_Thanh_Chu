import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int num = sc.nextInt();
        if (num > 0 && num < 10) {
            System.out.println(tu0Den9(num));
        } else if (num >= 10 && num < 20) {
            System.out.println(tu10den19(num));
        } else if (num >= 20 && num < 100) {
            System.out.println(tu20den99(num));
        } else if (num >= 100 && num < 1000) {
            System.out.println(tu100den999(num));
        }

    }

    public static String tu0Den9(int so) {
        String doc;
        switch (so) {
            case 1:
                doc = "one";
                break;
            case 2:
                doc = "two";
                break;
            case 3:
                doc = "three";
                break;
            case 4:
                doc = "four";
                break;
            case 5:
                doc = "five";
                break;
            case 6:
                doc = "six";
                break;
            case 7:
                doc = "seven";
                break;
            case 8:
                doc = "eight";
                break;
            case 9:
                doc = "nine";
                break;
            default:
                doc = "";
        }
        return doc;
    }

    public static String tu10den19(int so) {
        String doc;
        int donvi = so % 10;
        switch (donvi) {
            case 0:
                doc = "ten";
                break;
            case 1:
                doc = "eleven";
                break;
            case 2:
                doc = "twelve";
                break;
            case 3:
                doc = "thirteen";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                doc = tu0Den9(donvi) + "teen";
                break;
            default:
                doc = "";
        }
        return doc;
    }

    public static String tu20den99(int so) {
        String doc;
        int donvi = so % 10;
        int hangchuc = (int) Math.floor(so / 10);
        switch (hangchuc) {
            case 0:
                doc = tu0Den9(donvi);
                break;
            case 1:
                doc = tu10den19(donvi);
                break;
            case 2:
                if (donvi == 0) {
                    doc = "twenty";
                } else {
                    doc = "twenty " + tu0Den9(donvi);
                }
                break;
            case 3:
                if (donvi == 0) {
                    doc = "thirty";
                } else {
                    doc = "thirty " + tu0Den9(donvi);
                }
                break;
            case 4:
                if (donvi == 0) {
                    doc = "forty";
                } else {
                    doc = "forty " + tu0Den9(donvi);
                }
                break;
            case 5:
                if (donvi == 0) {
                    doc = "fifty";
                } else {
                    doc = "fifty " + tu0Den9(donvi);
                }
                break;
            case 6:
                if (donvi == 0) {
                    doc = "sixty";
                } else {
                    doc = "sixty " + tu0Den9(donvi);
                }
                break;
            case 7:
                if (donvi == 0) {
                    doc = "seventy";
                } else {
                    doc = "seventy " + tu0Den9(donvi);
                }
                break;
            case 8:
                if (donvi == 0) {
                    doc = "eighty";
                } else {
                    doc = "eighty " + tu0Den9(donvi);
                }
                break;
            case 9:
                if (donvi == 0) {
                    doc = "ninety";
                } else {
                    doc = "ninety " + tu0Den9(donvi);
                }
                break;
            default:
                doc = "";
        }
        return doc;
    }

    public static String tu100den999(int so) {
        String doc;
        int hangtram = (int) Math.floor(so / 100);
        int hangchuc = (int) Math.floor(so / 10) % 10;
        int donvi = so % 100;
        switch (hangtram) {
            case 1:
                if (hangchuc == 0) {
                    doc = "one hundred";
                } else {
                    doc = "one hundred " + tu20den99(donvi);
                }
                break;
            case 2:
                if (hangchuc == 0) {
                    doc = "two hundred";
                } else {
                    doc = "two hundred " + tu20den99(donvi);
                }
                break;
            case 3:
                if (hangchuc == 0) {
                    doc = "three hundred";
                } else {
                    doc = "three hundred " + tu20den99(donvi);
                }
                break;
            case 4:
                if (hangchuc == 0) {
                    doc = "four hundred";
                } else {
                    doc = "four hundred " + tu20den99(donvi);
                }
                break;
            case 5:
                if (hangchuc == 0) {
                    doc = "five hundred";
                } else {
                    doc = "five hundred " + tu20den99(donvi);
                }
                break;
            case 6:
                if (hangchuc == 0) {
                    doc = "six hundred";
                } else {
                    doc = "six hundred " + tu20den99(donvi);
                }
                break;
            case 7:
                if (hangchuc == 0) {
                    doc = "seven hundred";
                } else {
                    doc = "seven hundred " + tu20den99(donvi);
                }
                break;
            case 8:
                if (hangchuc == 0) {
                    doc = "eight hundred";
                } else {
                    doc = "eight hundred " + tu20den99(donvi);
                }
                break;
            case 9:
                if (hangchuc == 0) {
                    doc = "nine hundred";
                } else {
                    doc = "nine hundred " + tu20den99(donvi);
                }
                break;
            default:
                doc = "";
        }
        return doc;
    }
}
