/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package movies.provider;

import java.util.ArrayList;
import java.util.Collection;

import movies.util.MoviesAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MoviesItemProviderAdapterFactory extends MoviesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoviesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link movies.Movie} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovieItemProvider movieItemProvider;

	/**
	 * This creates an adapter for a {@link movies.Movie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMovieAdapter() {
		if (movieItemProvider == null) {
			movieItemProvider = new MovieItemProvider(this);
		}

		return movieItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link movies.MovieCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovieCollectionItemProvider movieCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link movies.MovieCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMovieCollectionAdapter() {
		if (movieCollectionItemProvider == null) {
			movieCollectionItemProvider = new MovieCollectionItemProvider(this);
		}

		return movieCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link movies.Performer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformerItemProvider performerItemProvider;

	/**
	 * This creates an adapter for a {@link movies.Performer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerformerAdapter() {
		if (performerItemProvider == null) {
			performerItemProvider = new PerformerItemProvider(this);
		}

		return performerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link movies.Series} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriesItemProvider seriesItemProvider;

	/**
	 * This creates an adapter for a {@link movies.Series}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeriesAdapter() {
		if (seriesItemProvider == null) {
			seriesItemProvider = new SeriesItemProvider(this);
		}

		return seriesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link movies.Season} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonItemProvider seasonItemProvider;

	/**
	 * This creates an adapter for a {@link movies.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeasonAdapter() {
		if (seasonItemProvider == null) {
			seasonItemProvider = new SeasonItemProvider(this);
		}

		return seasonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link movies.Episode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeItemProvider episodeItemProvider;

	/**
	 * This creates an adapter for a {@link movies.Episode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEpisodeAdapter() {
		if (episodeItemProvider == null) {
			episodeItemProvider = new EpisodeItemProvider(this);
		}

		return episodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link movies.Director} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectorItemProvider directorItemProvider;

	/**
	 * This creates an adapter for a {@link movies.Director}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDirectorAdapter() {
		if (directorItemProvider == null) {
			directorItemProvider = new DirectorItemProvider(this);
		}

		return directorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link movies.Studio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudioItemProvider studioItemProvider;

	/**
	 * This creates an adapter for a {@link movies.Studio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudioAdapter() {
		if (studioItemProvider == null) {
			studioItemProvider = new StudioItemProvider(this);
		}

		return studioItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (movieItemProvider != null) movieItemProvider.dispose();
		if (movieCollectionItemProvider != null) movieCollectionItemProvider.dispose();
		if (performerItemProvider != null) performerItemProvider.dispose();
		if (seriesItemProvider != null) seriesItemProvider.dispose();
		if (seasonItemProvider != null) seasonItemProvider.dispose();
		if (episodeItemProvider != null) episodeItemProvider.dispose();
		if (directorItemProvider != null) directorItemProvider.dispose();
		if (studioItemProvider != null) studioItemProvider.dispose();
	}

}
