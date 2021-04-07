package com.ghy.demo11.optimize;
//转换策略
public enum TransitionEnum {

    DOC("doc"){
        public TransitionStrategy create(){
            return new DocTransition();
        }
    },
    DWG("dwg"){
        public TransitionStrategy create(){
            return new DwgTransition();
        }
    };

    /**
     * 根据枚举值获取bean实例
     * @param transitionEnum
     * @return
     */
    public static TransitionStrategy newInstance(TransitionEnum transitionEnum) {
        return transitionEnum.create();
    }

    public abstract TransitionStrategy create();

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    TransitionEnum(String code) {
        this.code = code;
    }
    /**
     * 根据code获取枚举
     * @param code
     * @return
     */
    public static TransitionEnum getEnum(String code) {
        for (TransitionEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
