import { Typography } from "@mui/material";
import { GridColDef } from "@mui/x-data-grid";
import { ArticleColumn } from "../model/article-column";
import { MyTypography } from "../../common/style/cell";

interface CellType{
    row : ArticleColumn
}

export default function ArticleColumns(): GridColDef[]{

   
    return [
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'id',
            headerName: 'No.',
            renderCell: ({row}:CellType) =>  MyTypography(row.id, "1.2rem")
            },
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'title',
            headerName: '제목',
            renderCell: ({row}:CellType) =>  MyTypography(row.title, "1.2rem")
            },                       
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'content',
            headerName: '내용',
            renderCell: ({row}:CellType) =>  MyTypography(row.content, "1.2rem")
            },
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'registerDate',
            headerName: '등록일',
            renderCell: ({row}:CellType) =>  MyTypography(row.regDate, "1.2rem")
            }
    ]

}