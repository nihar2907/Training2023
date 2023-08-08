package net.media.training.designpattern.builder;

public class XmlBuilder {

    private StringBuilder convertToXml;

    public XmlBuilder(int size) {
        convertToXml = new StringBuilder();
        convertToXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><People number=\"" + size + "\">");
    }

    public void addPerson(int id, String name, String city, String country) {
        convertToXml.append("<Person id=\"").append(id).append("\" name=\"").append(name).append("\">");
        convertToXml.append("<Address><City>").append(city).append("</City><Country>").append(country).append("</Country></Address>");
        convertToXml.append("</Person>");
    }
    
    public String build() {
        convertToXml.append("</People>");
        return convertToXml.toString();
    }
}
