import { createSlice } from "@reduxjs/toolkit";
import { findAllUsers, findUserById, login } from "./user-service";
import { initialState } from "./user-init";

const userThunks = [findAllUsers, findUserById]

const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}

export const userSlice = createSlice({
    name: "users",
    initialState,
    reducers: {},
    extraReducers:builder => {
        const {pending, rejected} = status;
        builder
        .addCase(findAllUsers.fulfilled, (state:any, {payload}:any)=>{state.array= payload})
        .addCase(findUserById.fulfilled, (state:any, {payload}:any)=>{state.json= payload})
        .addCase(login.fulfilled, (state:any, {payload}:any)=>{state.message = payload})
    }

})
export const getAllUsers = (state: any) => state.user.array
export const getUserById = (state: any) => state.user.json
export const loginResult = (state: any) => state.user.message


export const {} = userSlice.actions

export default userSlice.reducer