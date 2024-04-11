import { instance } from "@/app/component/common/configs/axios-config"

export const findAllUsersAPI = async (page: number) =>{
    try{
        const response = await instance.get('/users/list',{
            params: {page, limit: 10}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
}

export const findUserByIdAPI = async (id:number) =>{
    try{
        const response = await instance.get(`/users/detail` ,{params: {id}})
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
}

export const userDeleteByIdAPI = async (id:number) =>{
    try{
        const response = await instance.get(`/users/delete` , {params: {id}})
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
}