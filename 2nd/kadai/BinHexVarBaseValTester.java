
public class BinHexVarBaseValTester {
    public static void main(String[] args) {
        BinHexVarBaseValue[] varBaseVals = new BinHexVarBaseValue[4];

        //値の設定
        varBaseVals[0] = new BinHexVarBaseValue(2);
        varBaseVals[1] = new BinHexVarBaseValue(8);
        varBaseVals[2] = new BinHexVarBaseValue(17);
        varBaseVals[3] = new BinHexVarBaseValue(257);
        
        //print用のmethodを作成した
        //baseに20と1を代入し、それぞれ16と2になることを確かめている

        //1は2進数に置き換えられる
        print(1, varBaseVals);
        //8進数
        print(8, varBaseVals);
        //10進数
        print(10, varBaseVals);
        //20は16進数に置き換えられる
        print(20, varBaseVals);

        //値の再設定, setValue()のテスト
        varBaseVals[0].setValue(100);
        varBaseVals[1].setValue(3568);
        varBaseVals[2].setValue(4095);
        varBaseVals[3].setValue(252);

        //再設定できたことをテスト
        print(16, varBaseVals);
    }
    
    //動作が正しく行えていることを確認するmethod
    private static void print(int base, BinHexVarBaseValue[] a) {

        //baseをsetできていることを確認
        BinHexVarBaseValue.setBase(base);

        //printした後、valueとbaseをgetできていることを確認（toStringの内容と合致している）
        for(int i = 0; i < a.length; i++) { 
            System.out.println("------------------------");
            System.out.println(a[i]); 
            System.out.println("getValue():" + a[i].getValue());
            System.out.println("getBase():" + BinHexVarBaseValue.getBase());
        }
    }
}