package com.javarush.module3.lesson16.abstractfactory;

public class Example3 {
}

interface AbstractFactory {
    Report createReport(String type);

    Item createItem(String type);
}

class ShortReportFactory implements AbstractFactory{

    @Override
    public Report createReport(String type) {
        return new ShortReport();
    }

    @Override
    public Item createItem(String type) {
        return new ShortReportItem();
    }
}

class FullReportFactory implements AbstractFactory{

    @Override
    public Report createReport(String type) {
        return new FullReport();
    }

    @Override
    public Item createItem(String type) {
        return new FullReportItem();
    }
}

class AbstractFactory1 {

    public Report createReport(String type) {
        switch (type) {
            case "full":
                return new FullReport();
            case "short":
                return new ShortReport();
            default:
                throw new IllegalArgumentException();
        }
    }

    public Item createItem(String type) {
        switch (type) {
            case "full":
                return new FullReportItem();
            case "short":
                return new ShortReportItem();
            default:
                throw new IllegalArgumentException();
        }
    }


}

class Report {

}

class FullReport extends Report {

}

class ShortReport extends Report {

}

class Item {

}

class FullReportItem extends Item {

}

class ShortReportItem extends Item {

}
