package com.liuwen;

/**
 * ----------------------------------------------------------------------
 *
 * @author Create by liu wen at 2021.4.13 11:16
 * <p>
 * ----------------------------------------------------------------------
 */
public class 软件设计七大原则 {
    public static void main(String[] args) {
        System.out.println("在软件开发中，为了提高软件系统的可维护性和可复用性，增加软件的可扩展性和灵活性，" +
                "程序员要尽量根据7条原则来开发程序，从而提高软件开发效率、节约软件开发成本和维护成本。" +
                "这些原则的目的只有一个：降低对象之间的耦合，增加程序的可复用性、可扩展性和可维护性。");
        System.out.println("一、开闭原则的含义是：\n" +
                "当应用的需求改变时，在不修改软件实体的源代码或者二进制代码的前提下，可以扩展模块的功能，使其满足新的需求。");
        System.out.println("二、里氏替换原则的含义是：\n" +
                "子类可以扩展父类的功能，但不能改变父类原有的功能。即:子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法。");
        System.out.println("三、依赖倒置原则的含义是：\n" +
                "高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象。即:核心思想是：要面向接口编程，不要面向实现编程");
        System.out.println("四、单一职责原则的含义是：\n" +
                "规定一个类应该有且仅有一个引起它变化的原因，否则类应该被拆分。");
        System.out.println("五、接口隔离原则的含义是：\n" +
                "要为各个类建立它们需要的专用接口，而不要试图去建立一个很庞大的接口供所有依赖它的类去调用。");
        System.out.println("六、迪米特法则的含义是：\n" +
                "如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。其目的是降低类之间的耦合度，提高模块的相对独立性。");
        System.out.println("七、合成复用原则的含义是：\n" +
                "要求在软件复用时，要尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。如果要使用继承关系，则必须严格遵循里氏替换原则。");

        System.out.println("设计原则     \t一句话归纳\t                                              目的\n" +
                "开闭原则  \t对扩展开放，对修改关闭\t                                        降低维护带来的新风险\n" +
                "里氏替换原则\t不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义\t防止继承泛滥\n" +
                "依赖倒置原则\t高层不应该依赖低层，要面向接口编程\t                            更利于代码结构的升级扩展\n" +
                "单一职责原则\t一个类只干一件事，实现类要单一\t                                便于理解，提高代码的可读性\n" +
                "接口隔离原则\t一个接口只干一件事，接口要精简单一\t                            功能解耦，高聚合、低耦合\n" +
                "迪米特法则\t不该知道的不要知道，一个类应该保持对其它对象最少的了解，降低耦合度\t    只和朋友交流，不和陌生人说话，减少代码臃肿\n" +
                "合成复用原则\t尽量使用组合或者聚合关系实现代码复用，少使用继承\t                降低代码耦合");
    }
}
