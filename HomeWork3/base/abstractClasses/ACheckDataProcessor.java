package dz_copy.HomeWork3.base.abstractClasses;

import HomeWork3.base.abstractClasses.ACheckData;
import HomeWork3.base.abstractClasses.ACheckFullName;
import HomeWork3.base.abstractClasses.ACheckQuantity;
import HomeWork3.base.interfaces.ICheckBirthday;
import HomeWork3.base.interfaces.ICheckFullName;
import HomeWork3.base.interfaces.ICheckQuantity;
import HomeWork3.base.interfaces.ICheckSex;

public abstract class ACheckDataProcessor implements ICheckFullName, ICheckQuantity, ICheckBirthday, ICheckSex {
    protected HomeWork3.base.abstractClasses.ACheckQuantity checkQuantity;
    protected HomeWork3.base.abstractClasses.ACheckFullName checkFullName;
    protected HomeWork3.base.abstractClasses.ACheckData checkBirthday;
    protected HomeWork3.base.abstractClasses.ACheckData checkSex;

    public ACheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, HomeWork3.base.abstractClasses.ACheckData checkBirthday, ACheckData checkSex) {
        this.checkQuantity = checkQuantity;
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
    }
}
