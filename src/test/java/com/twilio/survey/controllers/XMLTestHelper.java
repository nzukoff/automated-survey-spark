package com.twilio.survey.controllers;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLTestHelper {
  public static Document createDocumentFromXml(String input)
      throws ParserConfigurationException, SAXException, IOException {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

    StringReader stringReader = new StringReader(input);
    InputSource inputSource = new InputSource(stringReader);
    return documentBuilder.parse(inputSource);
  }
}
