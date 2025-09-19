class Spreadsheet {
    int grid[][];
    public Spreadsheet(int rows) {
        grid=new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        int col=cell.charAt(0)-'A';
        int row=Integer.parseInt(cell.substring(1));
        grid[row-1][col]=value;
    }
    
    public void resetCell(String cell) {
        int col=cell.charAt(0)-'A';
        int row=Integer.parseInt(cell.substring(1));
        grid[row-1][col]=0;
    }

    public int getCell(String cell)
    {
        int col=cell.charAt(0)-'A';
        int row=Integer.parseInt(cell.substring(1));
        return grid[row-1][col];
    }
    
    public int getValue(String formula) {
        String arr[]=formula.split("\\+");
        arr[0]=arr[0].substring(1);
        int val=0;
        if(arr[0].charAt(0)>='A' && arr[0].charAt(0)<='Z')
        val+=getCell(arr[0]);
        else
        val+=Integer.parseInt(arr[0]);
        if(arr[1].charAt(0)>='A' && arr[1].charAt(0)<='Z')
        val+=getCell(arr[1]);
        else
        val+=Integer.parseInt(arr[1]);
        return val;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */