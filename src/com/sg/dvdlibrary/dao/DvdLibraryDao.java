package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.Dvd;

import java.util.List;

public interface DvdLibraryDao {
    /**
     * Adds the given Student to the roster and associates it with the given
     * student id. If there is already a student associated with the given
     * student id it will return that student object, otherwise it will
     * return null.
     *
     * @param dvdTitle id with which student is to be associated
     * @param dvd student to be added to the roster
     * @return the Student object previously associated with the given
     * student id if it exists, null otherwise
     * @throws DvdLibraryDaoException
     */
    Dvd addDvd(String dvdTitle, Dvd dvd)
            throws DvdLibraryDaoException;

    /**
     * Returns a List of all Students on the roster.
     *
     * @return Student List containing all students on the roster.
     * @throws DvdLibraryDaoException
     */
    List<Dvd> getAllDvds()
            throws DvdLibraryDaoException;

    /**
     * Returns the student object associated with the given student id.
     * Returns null if no such student exists
     *
     * @param dvdTitle ID of the student to retrieve
     * @return the Student object associated with the given student id,
     * null if no such student exists
     * @throws DvdLibraryDaoException
     */
    Dvd getDvd(String dvdTitle)
            throws DvdLibraryDaoException;

    /**
     * Removes from the roster the student associated with the given id.
     * Returns the student object that is being removed or null if
     * there is no student associated with the given id
     *
     * @param dvdTitle id of student to be removed
     * @return Student object that was removed or null if no student
     * was associated with the given student id
     * @throws DvdLibraryDaoException
     */
    Dvd removeDvd(String dvdTitle)
            throws DvdLibraryDaoException;
}