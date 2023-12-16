import React from 'react'
import ReactDOM from 'react-dom/client'
import './index.css'
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Index from './pages/Index/Index.jsx';
import Login from './pages/Login/Login.jsx';
import Register from './pages/Register/Register.jsx';
import Study from './pages/Study/Study.jsx';
import RecruitingCourse from './pages/RecruitingCourse/RecruitingCourse.jsx';
import OngoingCourse from './pages/OngoingCourse/OngoingCourse.jsx';
import CompletedCourse from './pages/CompletedCourse/CompletedCourse.jsx';
import CreateCourse from './pages/CreateCourse/CreateCourse.jsx';
import ModifyCourse from './pages/ModifyCourse/ModifyCourse.jsx';
import CourseRoom from './pages/CourseRoom/CourseRoom.jsx';
import CreateHomework from './pages/CreateHomework/CreateHomework.jsx';
import SubmitHomework from './pages/SubmitHomework/SubmitHomework.jsx';
import MyPage from './pages/MyPage/MyPage.jsx';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Index />}></Route>
        <Route path='/login' element={<Login />}></Route>
        <Route path='/register' element={<Register />}></Route>
        <Route path='/study' element={<Study />}></Route>
        <Route path='/recruitingCourse' element={<RecruitingCourse />}></Route>
        <Route path='/ongoingCourse' element={<OngoingCourse />}></Route>
        <Route path='/completedCourse' element={<CompletedCourse />}></Route>
        <Route path='/createCourse' element={<CreateCourse />}></Route>
        <Route path='/modifyCourse' element={<ModifyCourse />}></Route>
        <Route path='/courseRoom' element={<CourseRoom />}></Route>
        <Route path='/createHomework' element={<CreateHomework />}></Route>
        <Route path='/submitHomework' element={<SubmitHomework />}></Route>
        <Route path='/myPage' element={<MyPage />}></Route>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>,
)
