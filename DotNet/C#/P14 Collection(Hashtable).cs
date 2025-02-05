using System;
using System.Collections;
namespace CollectionApplication{
    class Program{
        static void Main(string[] args)
        {
            Hashtable ht=new Hashtable();
            ht.Add("ora","oracle");
            ht.Add("vb","vb.NET");
            ht.Add("cs","cs.NET");
            ht.Add("asp","asp.NET");
            for each(DictionaryEntry d in ht)
            {
                Response.write(d.key+" "+d.Value);
                Response.Write("<br>")
            }
        }
    }
}