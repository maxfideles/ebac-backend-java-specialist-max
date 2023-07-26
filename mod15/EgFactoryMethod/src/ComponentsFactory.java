public class ComponentsFactory extends BaseComponentsFactory{

    @Override
    UIComponents createComponents(String os) {
        UIComponents uiComponent;
         switch (os.toLowerCase()) {
            case "android" -> uiComponent =  new AndroidComponents();
            case "ios" -> uiComponent = new IOSComponents();
            default -> throw new IllegalArgumentException("Select among Android or iOS.");
        };
         return uiComponent;
    }
}
