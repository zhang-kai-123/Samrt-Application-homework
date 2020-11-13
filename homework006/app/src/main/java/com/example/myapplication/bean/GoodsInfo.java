package com.example.myapplication.bean;

import com.example.myapplication.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "戴尔", "Lenovo", "HP", "Macbook", "宏碁", "华硕","RedmiBook","机械革命"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "戴尔DELL灵越5000 14英寸酷睿i5网课学习轻薄笔记本电脑(十代i5-1035G1 8G 512G MX230 2G独显)银",
            "联想(Lenovo)小新Pro13 2020锐龙版轻薄本 全面屏办公笔记本电脑(8核R7-4800U 16G 512G 高色域)深空灰",
            "惠普（HP）战66 四代 14英寸轻薄笔记本电脑（英特尔酷睿11代i5 16G 512G MX450 高色域 一年上门+意外）",
            "Apple MacBook Air 13.3 | Core i5 8G 128G SSD 笔记本电脑 轻薄本 银色 MQD32CH/A",
            "宏碁(Acer)蜂鸟Fun 14英寸轻薄本 学生商务办公wifi6笔记本电脑(英特尔酷睿i5-10210U 8G 512G MX350独显)银",
            "华硕Redolbook14 锐龙版 7nm六核高性能轻薄本 网课学生办公笔记本电脑(R5-4500U 16G 512G PCIe固态)高闪银",
            "RedmiBook 16 (第十代英特尔酷睿i5-1035G1 16G 512G MX350 2G 100%sRGB)灰 手提 笔记本电脑 小米 红米",
            "机械革命（MECHREVO）Code01 15.6英寸(R7-4800H 16G 512G PCIE 100%sRGB WIFI6)轻薄笔记本电脑 媲美游戏本"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {4199, 5599, 5799, 5499, 3799, 3899,4899,5299};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.daier_s, R.drawable.lenovo_s, R.drawable.hp_s,
            R.drawable.mackbook_s, R.drawable.hj_s, R.drawable.hs_s, R.drawable.redmin_s, R.drawable.jx_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.daier, R.drawable.lenovo, R.drawable.hp,
            R.drawable.macbook, R.drawable.hj, R.drawable.hs,
            R.drawable.redmi, R.drawable.jx
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
