    static Object[] flatten(Object[] array){
        List list=new ArrayList();
        for(Object a:array){
            if(a instanceof Object[]){
               for(Object ob:flatten((Object[]) a))
                   list.add(ob);
            }
            else
                list.add(a);

        }
        return list.toArray();
    }
