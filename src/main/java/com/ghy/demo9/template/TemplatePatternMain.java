package com.ghy.demo9.template;

public class TemplatePatternMain {
    public static void main(String[] args) {

        AbstractTemplate template = new ConcreteTemplate();

        template.templateMethod();
    }
}
