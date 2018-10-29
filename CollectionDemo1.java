package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 集合
 * 集合与数组相似，可以保存一组元素，并且提供了操作集合元素的相关方法，
 * 使用便捷。Collection接口下面有两个常见的子接口：
 * java.util.List:可重复集合，并且有序，可以通过下标操作元素。
 * java.util.Set:不可重复集合。
 * 元素是否重复是依靠元素自身equals比较进行判定的。
 * @author soft01
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		/*
		 * boolean add(E e)
		 * 向当前集合中添加给定元素，当元素成功添加则返回true。
		 */
		c.add("laji");
		c.add("wudi");
		c.add("pofang");
		c.add("cdfee");
		c.add("ggogo");
		System.out.println(c);
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 */
		int size = c.size();
		System.out.println("size："+size);
		/*
		 * boolean isEmpty()
		 * 判断当前集合是否为空集（不含有任何元素）
		 */
		
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		/*
		 * void clear();
		 */
		c.clear();
		System.out.println("集合已清空");
		System.out.println("size:"+size);
		System.out.println("isEmpty:"+c.isEmpty());
	}
}
