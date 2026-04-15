// mainメソッドを含むVarBaseValTesterクラスを書く

public class BinHex {
    public static void main(String[] args) {
        VariableBaseValue[] varBaseVals = new VariableBaseValue[3];

        //値の設定
        varBaseVals[0] = new VariableBaseValue(2);
        varBaseVals[1] = new VariableBaseValue(8);
        varBaseVals[2] = new VariableBaseValue(17);
        
        //print用のmethodを作成した
        //baseに15と1を代入し、それぞれ10と2になることを確かめている
        print(15, varBaseVals);
        print(1, varBaseVals);
        print(6, varBaseVals);

        //値の再設定, setValue()のテスト
        varBaseVals[0].setValue(100);
        varBaseVals[1].setValue(10);
        varBaseVals[2].setValue(1);

        //再設定できたことをテスト
        print(2, varBaseVals);
        print(5, varBaseVals);
        print(8, varBaseVals);
    }
    
    //動作が正しく行えていることを確認するmethod
    private static void print(int base, VariableBaseValue[] a) {

        //baseをsetできていることを確認
        VariableBaseValue.setBase(base);

        //printした後、valueとbaseをgetできていることを確認（toStringの内容と合致している）
        for(int i = 0; i < a.length; i++) { 
            System.out.println("------------------------");
            System.out.println(a[i]); 
            System.out.println("getValue():" + a[i].getValue());
            System.out.println("getBase():" + VariableBaseValue.getBase());
        }
    }
}