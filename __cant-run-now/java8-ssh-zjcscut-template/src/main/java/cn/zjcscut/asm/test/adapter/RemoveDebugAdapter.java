package cn.zjcscut.asm.test.adapter;

import aj.org.objectweb.asm.ClassVisitor;

import org.objectweb.asm.Opcodes;

/**
 * @author zhangjinci
 * @version 2016/7/5 19:41
 */
public class RemoveDebugAdapter extends ClassVisitor{
    public static final int ASM_API_VERSION = Opcodes.ASM4;
    public RemoveDebugAdapter(ClassVisitor classVisitor) {
        super(ASM_API_VERSION, classVisitor);
    }

    //类适配器用于移除所有外部类以及内部类的信息,还删除了一个源文件的名字

    @Override
    public void visitInnerClass(String s, String s1, String s2, int i) {
    }

    @Override
    public void visitSource(String s, String s1) {
    }

    @Override
    public void visitOuterClass(String s, String s1, String s2) {
    }
}
