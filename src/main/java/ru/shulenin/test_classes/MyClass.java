package ru.shulenin.test_classes;


import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.shulenin.annotition.AutoInjectable;

@NoArgsConstructor
public class MyClass {
    @AutoInjectable
    @Setter
    private InterfaceTest interfaceTest;
}
